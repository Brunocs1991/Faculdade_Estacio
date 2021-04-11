package cursoandroid.com.aulapersistencia_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {
    static final int READ_BLOCK_SIZE = 100;
    private EditText txtMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMensagem = (EditText) findViewById(R.id.quadroTexto);
    }
    public void gravarArquivo(View v){
        try {
            FileOutputStream fileOutput = openFileOutput("arquivo.txt", MODE_PRIVATE);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutput);
            outputStreamWriter.write(txtMensagem.getText().toString());
            outputStreamWriter.close();
            Toast.makeText(getBaseContext(),"Gravação Realizada vom sucesso", Toast.LENGTH_LONG).show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void lerArquivo(View v){
        try{
            FileInputStream fileInputStream = openFileInput("arquivo.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            char[] inputBuffer = new char[READ_BLOCK_SIZE];
            String s ="";
            int charRead;

            while((charRead=inputStreamReader.read(inputBuffer))>0){
                String readStringLine = String.copyValueOf(inputBuffer,0,charRead);
                s+=readStringLine;
            }
            inputStreamReader.close();
            txtMensagem.setText(s);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
