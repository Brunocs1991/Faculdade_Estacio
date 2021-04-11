package cursoandroid.com.aulapersistence_4;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Atualizar_activity extends Activity implements View.OnClickListener {

    private EditText nomeTexto,emailTexto;
    private Button btnAtualizar, btnApagar;
    private long _id;
    private DBManager dbManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Alterar Dados");
        setContentView(R.layout.atualizar_activity);
        dbManager = new DBManager(this);
        dbManager.open();

        nomeTexto = (EditText) findViewById(R.id.quadroTextoNome);
        emailTexto = (EditText) findViewById(R.id.quadroTextoEmail);
        btnAtualizar = (Button) findViewById(R.id.botaoAtualizar);
        btnApagar = (Button) findViewById(R.id.botaoApagar);

        Intent intent = getIntent();
        String id = intent.getStringExtra("id");
        String name = intent.getStringExtra("title");
        String desc = intent.getStringExtra("desc");
        _id = Long.parseLong(id);
        nomeTexto.setText(name);
        emailTexto.setText(desc);
        btnAtualizar.setOnClickListener(this);
        btnApagar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.botaoAtualizar:
                String nome = nomeTexto.getText().toString();
                String email = emailTexto.getText().toString();
                dbManager.update(_id, nome, email);
                this.returnHome();
                break;
            case R.id.botaoApagar:
                dbManager.delete(_id);
                this.returnHome();
            break;
        }
    }
    public void returnHome(){
        Intent home_intent = new Intent(getApplicationContext(),MainActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(home_intent);
    }
}
