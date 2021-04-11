package cursoandroid.com.aulapersistencia_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    private EditText inputText;
    private TextView response;
    private Button botaoGravar, botaoLer;
    private String nomeArquivo = "arquivo.txt";
    private String pathArquivo = "meuPath";
    File myEsternalFile;
    String myDate = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = (EditText) findViewById(R.id.quadroTexto);
        response = (TextView) findViewById(R.id.quadroTextoResposta);
        botaoGravar = (Button) findViewById(R.id.botaoGravar);
        botaoGravar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(myEsternalFile);
                    fileOutputStream.write(inputText.getText().toString().getBytes());
                    fileOutputStream.close();

                } catch (IOException i) {
                    i.printStackTrace();
                }
                inputText.setText("");
                response.setText("Gravação efetuada com sucesso");
            }
        });
        botaoLer = (Button) findViewById(R.id.botaoLer);
        botaoLer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    FileInputStream fileInputStream = new FileInputStream(myEsternalFile);
                    DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dataInputStream));
                    String strline;
                    while ((strline = dataInputStream.readLine()) != null) {
                        myDate = myDate + strline;
                    }
                    dataInputStream.close();
                } catch (IOException i) {
                    i.printStackTrace();
                    ;
                }
                inputText.setText(myDate);
                response.setText("Leitura efetuada com Sucesso!");
            }
        });
        if(!isExternalStorageAvaliable() || isExternalStorageReadOnly()){
            botaoGravar.setEnabled(false);
        }
        else{
            myEsternalFile = new File(getExternalFilesDir(pathArquivo), nomeArquivo);
        }
    }
    private static boolean isExternalStorageReadOnly(){
        String extStorageState = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED_READ_ONLY.equals(extStorageState)){
            return true;
        }else{
            return false;
        }
    }
    private static boolean isExternalStorageAvaliable(){
        String extStorageState = Environment.getExternalStorageState();
        if(Environment.MEDIA_MOUNTED.equals(extStorageState)){
            return true;
        }else{
            return false;
        }
    }
}
