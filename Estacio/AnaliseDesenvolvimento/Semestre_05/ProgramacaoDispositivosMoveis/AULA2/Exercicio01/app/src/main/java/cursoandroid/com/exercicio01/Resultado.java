package cursoandroid.com.exercicio01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView resultado;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        resultado = (TextView) findViewById(R.id.textView3);
        Intent intent = getIntent();
        String sum = (String) intent.getSerializableExtra("SOMA");
        resultado.setText(sum);
    }
}
