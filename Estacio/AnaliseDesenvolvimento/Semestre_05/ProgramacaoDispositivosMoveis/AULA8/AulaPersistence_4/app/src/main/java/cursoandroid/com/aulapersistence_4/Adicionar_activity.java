package cursoandroid.com.aulapersistence_4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Adicionar_activity extends Activity implements View.OnClickListener {

    private Button botaoAdicionar;
    private EditText nome_EditText;
    private EditText email_EditText;
    private DBManager dbManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle("Adicionar Dados");
        setContentView(R.layout.adicionar_activity);

        nome_EditText = (EditText) findViewById(R.id.quadroTextoNome);
        email_EditText = (EditText) findViewById(R.id.quadroTextoEmail);
        botaoAdicionar = (Button) findViewById(R.id.botaoAdicionar);
        dbManager = new DBManager(this);
        dbManager.open();
        botaoAdicionar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.botaoAdicionar:
            final String nome = nome_EditText.getText().toString();
            final String email = email_EditText.getText().toString();
            dbManager.insert(nome,email);
                Intent main = new Intent(Adicionar_activity.this, MainActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(main);
                break;
        }
    }
}
