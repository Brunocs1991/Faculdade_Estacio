package cursoandroid.com.androidlocationapiexample;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

import java.sql.Connection;

public class MainActivity extends Activity implements LocationListener {

    private GoogleApiClient googleApiClient;
    private LocationRequest locationRequest;
    private TextView textViewLatitude, textViewLongitude;

    private double latitude = 0.0;
    private double longitude = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
        if(checkPlayServices()){
            startFusedLocation();
            registerRequestUpdate(this);
        }
    }
    private void initializeViews() {
        textViewLatitude = (TextView) findViewById(R.id.text_latitude);
        textViewLongitude = (TextView) findViewById(R.id.text_longitude);
    }
    @Override
    protected void onStop() {
        stopFusedLocation();
        super.onStop();
    }
    private boolean checkPlayServices() {
        int resultCode = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);
        if(resultCode != ConnectionResult.SUCCESS){
            if(GooglePlayServicesUtil.isUserRecoverableError(resultCode)){
                Toast.makeText(getApplicationContext(),"Erro. efetue o download google play services", Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(getApplicationContext(),"Erro. ", Toast.LENGTH_LONG).show();
                finish();
            }
            return false;
        }
        return true;
    }
    private void startFusedLocation() {
        if(googleApiClient == null){
            googleApiClient = new GoogleApiClient.Builder(this).addApi(LocationServices.API)
                    .addConnectionCallbacks(new GoogleApiClient.ConnectionCallbacks() {
                        @Override
                        public void onConnected(@Nullable Bundle bundle) {
                        }
                        @Override
                        public void onConnectionSuspended(int i) {
                        }
                    }).addOnConnectionFailedListener(new GoogleApiClient.OnConnectionFailedListener() {
                        @Override
                        public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
                        }
                    }).build();
            googleApiClient.connect();
        }else{
            googleApiClient.connect();
        }
    }
    private void stopFusedLocation() {
        if(googleApiClient != null){
            googleApiClient.disconnect();
        }
    }
    private void registerRequestUpdate(final LocationListener listener) {
        locationRequest = LocationRequest.create();
        locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
        locationRequest.setInterval(1000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                try {
                    LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient,locationRequest, (com.google.android.gms.location.LocationListener) listener);
                }catch (SecurityException e){
                    e.printStackTrace();
                }catch (Exception e){
                    e.printStackTrace();
                    if(!isGoogleApiClientConnected()){
                        googleApiClient.connect();
                    }
                    registerRequestUpdate(listener);
                }
            }
        },1000);
    }
    public boolean isGoogleApiClientConnected(){
        return googleApiClient != null && googleApiClient.isConnected();
    }

    @Override
    public void onLocationChanged(Location location) {
        setLatitude(location.getLatitude());
        setLongitude(location.getLongitude());

        Toast.makeText(getApplicationContext(), "Nova localização recebida", Toast.LENGTH_LONG).show();

        textViewLatitude.setText("Latitude:"+ " " + getLatitude());
        textViewLongitude.setText("Logitude:"+ " " + getLongitude());
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }


    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
