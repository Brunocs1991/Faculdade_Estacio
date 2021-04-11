package cursoandroid.com.aulapersistencia_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;
    private EditText nome;
    private EditText email;
    public static final String MINHASPREFERENCIAS = "minhaspreferencias";
    public static final String CHAVENOME = "chaveNome";
    public static final String CHAVEEMAIL = "chaveEmail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nome = (EditText) findViewById(R.id.etName);
        email = (EditText) findViewById(R.id.etEmail);
        sharedPreferences = getSharedPreferences(MINHASPREFERENCIAS, Context.MODE_PRIVATE);
        if (sharedPreferences.contains(CHAVENOME)){
            nome.setText(sharedPreferences.getString(CHAVENOME,""));
        }
        if(sharedPreferences.contains(CHAVEEMAIL)){
            email.setText(sharedPreferences.getString(CHAVEEMAIL,""));
        }
    }
    public void gravar(View view){
        String n = nome.getText().toString();
        String e = email.getText().toString();
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(CHAVENOME, n);
        editor.putString(CHAVEEMAIL, e);
        editor.commit();
    }
    public void limpar(View view){
        nome = (EditText) findViewById(R.id.etName);
        email = (EditText) findViewById(R.id.etEmail);
        nome.setText("");
        email.setText("");
    }
    public void ler(View view){
        nome = (EditText) findViewById(R.id.etName);
        email = (EditText) findViewById(R.id.etEmail);
        sharedPreferences = getSharedPreferences(MINHASPREFERENCIAS, Context.MODE_PRIVATE);
        if (sharedPreferences.contains(CHAVENOME)){
            nome.setText(sharedPreferences.getString(CHAVENOME,""));
        }
        if(sharedPreferences.contains(CHAVEEMAIL)){
            email.setText(sharedPreferences.getString(CHAVEEMAIL,""));
        }
    }
}
