package cursoandroid.com.aulalistview_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void executarTeste1Atividade(View view){
        Intent intent = new Intent(this, Teste1Atividade.class);
        startActivity(intent);
    }
    public void executarTeste2Atividade(View view){
        Intent intent = new Intent(this, Teste2Atividade.class);
        startActivity(intent);
    }
    public void executarTeste3Atividade(View view){
        Intent intent = new Intent(this, Teste3Atividade.class);
        startActivity(intent);
    }
    public void executarTeste4Atividade(View view){
        Intent intent = new Intent(this, Teste4Atividade.class);
        startActivity(intent);
    }
    public void executarTeste5Atividade(View view){
        Intent intent = new Intent(this, Teste5Atividade.class);
        startActivity(intent);
    }
    public void executaFim(View view){
        finish();
    }
}
