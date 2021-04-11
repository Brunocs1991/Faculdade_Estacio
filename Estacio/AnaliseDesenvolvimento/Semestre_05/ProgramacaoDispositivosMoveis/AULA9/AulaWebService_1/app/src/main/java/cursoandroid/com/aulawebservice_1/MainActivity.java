package cursoandroid.com.aulawebservice_1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

public class MainActivity extends AppCompatActivity {

    private Encomenda encomenda = new Encomenda();
    private Button btnEnviar;
    private EditText nCdServico, sCepOrigem, sCepDestino;
    private String getServico, getOrigem, getDestino, TAG = "Response";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnviar = (Button) findViewById(R.id.enviar);
        sCepOrigem = (EditText) findViewById(R.id.sCepOrigem);
        sCepDestino = (EditText) findViewById(R.id.sCepDestino);
        nCdServico = (EditText) findViewById(R.id.CdServico);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDestino = sCepDestino.getText().toString();
                getOrigem = sCepOrigem.getText().toString();
                getServico = nCdServico.getText().toString();
                AsyncCallWS task = new  AsyncCallWS();
                task.execute();
            }
        });
    }
    private class AsyncCallWS extends  AsyncTask<Void, Void, Void>{

        @Override
        protected Void doInBackground(Void... voids) {
            Log.i(TAG, "doInBackground");
            CalcPrazo();
            return null;
        }
        @Override
        protected void onPostExecute(Void result) {
            Log.i(TAG,"onPostExecute");
            AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
            dialogo.setTitle("Resultado");
            dialogo.setNeutralButton("OK", null);
            dialogo.setMessage("Código da encomenda: " + encomenda.getCodigo() +"\n " +
                               "Prazo de Entrega: " + encomenda.getPrazoEntrega()+"\n " +
                               "Entrega Domiciliar: " + encomenda.getEntregaDomiciliar() + "\n " +
                               "Entrega Sábado: " + encomenda.getEntregaSabado());
            dialogo.show();
        }
    }
    private void CalcPrazo(){
        String SOAP_ACTION = "http://tempuri.org/CalcPrazo";
        String METHOD_NAME = "CalcPrazo";
        String NAMESPACE = "http://tempuri.org/";
        String URL = "http://ws.correios.com.br/calculador/CalcPrecoPrazo.asmx";

        try {
            SoapObject Request = new SoapObject(NAMESPACE, METHOD_NAME);
            Request.addProperty("nCdServico",getServico);
            Request.addProperty("sCepOrigem", getOrigem);
            Request.addProperty("sCepDestino", getDestino);
            SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            soapEnvelope.dotNet = true;
            soapEnvelope.setOutputSoapObject(Request);
            HttpTransportSE transport = new HttpTransportSE(URL);

            transport.call(SOAP_ACTION, soapEnvelope);

            SoapObject response = (SoapObject) soapEnvelope.getResponse();
            response = (SoapObject) response.getProperty("Servicos");
            response = (SoapObject) response.getProperty("cServico");
            encomenda = new Encomenda();
            encomenda.setCodigo(response.getProperty("Codigo").toString());
            encomenda.setPrazoEntrega(response.getProperty("PrazoEntrega").toString());
            encomenda.setEntregaDomiciliar(response.getProperty("EntregaDomiciliar").toString());
            encomenda.setEntregaSabado(response.getProperty("EntregaSabado").toString());
        }catch (Exception ex){
            Log.e(TAG, "ERROR " + ex.getMessage());
        }
    }
}
