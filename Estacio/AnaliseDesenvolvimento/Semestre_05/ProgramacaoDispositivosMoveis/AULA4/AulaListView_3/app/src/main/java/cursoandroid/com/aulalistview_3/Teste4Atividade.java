package cursoandroid.com.aulalistview_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Teste4Atividade extends AppCompatActivity {

    private TextView textSetor;
    private TextView textFuncao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste4_atividade);
        textSetor = (TextView) findViewById(R.id.textViewSetor);
        textFuncao = (TextView) findViewById(R.id.textViewFuncao);
    }
    public void executarFim(View view){
        finish();
    }
}