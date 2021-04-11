package cursoandroid.com.aulamensagem_5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private Button botaoIniciar;
    private ProgressDialog barraProgresso;
    private int statusBarraProgresso = 0;
    private Handler manipuladorBarraProgresso = new Handler();
    private long TAMANHO = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerButton();
    }
    public void addListenerButton(){
        botaoIniciar =(Button) findViewById(R.id.botaoIniciarBarraProgresso);
        botaoIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                barraProgresso = new ProgressDialog(v.getContext());
                barraProgresso.setCancelable(true);
                barraProgresso.setMessage("Enviando ...");
                barraProgresso.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                barraProgresso.setProgress(0);
                barraProgresso.setMax(100);
                barraProgresso.show();
                statusBarraProgresso = 0;
                TAMANHO = 0;
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (statusBarraProgresso < 100){
                            statusBarraProgresso = doSomeTask();
                            try {
                                Thread.sleep(1000);
                            }catch (InterruptedException e){
                                e.printStackTrace();
                            }
                            manipuladorBarraProgresso.post(new Runnable() {
                                @Override
                                public void run() {
                                    barraProgresso.setProgress(statusBarraProgresso);
                                }
                            });
                        }
                        if(statusBarraProgresso >=100){
                            try {
                                Thread.sleep(2000);
                            }catch (InterruptedException e){
                                e.printStackTrace();
                            }
                            barraProgresso.dismiss();
                        }
                    }
                }).start();
            }
        });
    }
    public int doSomeTask(){
        while (TAMANHO <= 1000000){
            TAMANHO ++;
            if(TAMANHO == 100000){
                return 10;
            }else if(TAMANHO == 200000){
                return 20;
            }else if (TAMANHO == 300000){
                return 30;
            }
        }
        return 100;
    }
}
