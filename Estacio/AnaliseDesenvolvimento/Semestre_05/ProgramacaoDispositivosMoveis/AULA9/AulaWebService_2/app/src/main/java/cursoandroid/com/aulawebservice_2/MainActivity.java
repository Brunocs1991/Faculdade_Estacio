package cursoandroid.com.aulawebservice_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import cursoandroid.com.aulawebservice_2.model.Flor;
import cursoandroid.com.aulawebservice_2.parser.FlowerJSONParser;

public class MainActivity extends ListActivity {

    private final String PHOTO_BASE_URL = "http://services.hanselandpetal.com/photos/";

    private ProgressBar progressBar;
    private List<MyTask> tarefas;
    private List<Flor> listaFlores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = (ProgressBar) findViewById(R.id.progressBar1);
        progressBar.setVisibility(View.INVISIBLE);
        tarefas = new ArrayList<>();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(isOnline()){
            requestData("http://services.hanselandpetal.com/secure/flowers.json");
        }
        else{
            Toast.makeText(this,"Rede indisponível", Toast.LENGTH_LONG).show();
        }
        return false;
    }
    private void requestData(String uri){
        MyTask task = new MyTask();
        task.execute(uri);
    }
    private void updateDisplay(){
        FlowerAdapter adapter = new FlowerAdapter(this,R.layout.item_flower, listaFlores);
        setListAdapter(adapter);
    }
    protected boolean isOnline(){
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        if(netInfo != null && netInfo.isConnectedOrConnecting()){
            return true;
        }else{
            return false;
        }
    }
    private class MyTask extends AsyncTask<String, String, List<Flor>>{
        @Override
        protected void onPreExecute() {
            if(tarefas.size() == 0){
                progressBar.setVisibility(View.VISIBLE);
            }
            tarefas.add(this);
        }

        @Override
        protected List<Flor> doInBackground(String... params) {
            String content = HTTPManager.getData(params[0], "feeduser", "feedpassword");
            listaFlores = FlowerJSONParser.parseFeed(content);
            for(Flor flower : listaFlores){
                try{
                    String imageUrl = PHOTO_BASE_URL+flower.getFotoString();
                    InputStream in = (InputStream) new URL(imageUrl).getContent();
                    Bitmap bitmap = BitmapFactory.decodeStream(in);
                    flower.setFotoBitmap(bitmap);
                    in.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            return listaFlores;
        }

        @Override
        protected void onPostExecute(List<Flor> result) {
            tarefas.remove(this);
            if(tarefas.size() == 0){
                progressBar.setVisibility(View.INVISIBLE);
            }
            if(result == null){
                Toast.makeText(MainActivity.this,"Web Service indisponível", Toast.LENGTH_LONG).show();
                return;
            }
            updateDisplay();
        }
    }
}
