package cursoandroid.com.exercicio01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText numero1;
    EditText numero2;
    Button botaoSomar;
    int sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         numero1 = (EditText) findViewById(R.id.editText);
         numero2 = (EditText) findViewById(R.id.editText2);
        botaoSomar = (Button) findViewById(R.id.button);
        botaoSomar.setOnClickListener(new AddButtonClickHandler());
    }
    public class  AddButtonClickHandler implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            int num1 = Integer.parseInt(numero1.getText().toString());
            int num2 = Integer.parseInt(numero2.getText().toString());
            Intent explicitIntent = new Intent(MainActivity.this,Resultado.class);
            explicitIntent.putExtra("SOMA", num1+ "+" + num2 + "=" + (num1+num2));
            startActivity(explicitIntent);
        }

    }
}
