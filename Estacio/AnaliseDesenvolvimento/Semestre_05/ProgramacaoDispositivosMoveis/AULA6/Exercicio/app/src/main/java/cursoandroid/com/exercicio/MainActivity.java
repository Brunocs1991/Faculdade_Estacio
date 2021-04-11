package cursoandroid.com.exercicio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends FragmentActivity implements Confirmar.SimNaoDialog, Digitar.EntradaDadosDialog {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void exibirDialogFragment(View view){
        exibirEntradaDadosDialog();
    }
    private void exibirEntradaDadosDialog(){
        FragmentManager fragmentManager =   getSupportFragmentManager();
        Digitar inputNameDialog = new Digitar();
        inputNameDialog.setCancelable(false);
        inputNameDialog.setTituloDialogFragment("Entre com o seu nome");
        inputNameDialog.show(fragmentManager,"");
    }

    @Override
    public void finalizarEntradaDados(String texto) {
        Toast.makeText(this,"O nome " + texto + " foi enviado com sucesso", Toast.LENGTH_SHORT).show();
    }
    public void exibirSimNaoDialogFragment(View view){
        exibirSimNaoDialog();
    }
    public void exibirSimNaoDialog(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        Confirmar yesnoDialog = new Confirmar();
        yesnoDialog.setCancelable(false);
        yesnoDialog.setDialogTitle("Selecione uma das opções");
        yesnoDialog.show(fragmentManager,"");
    }
    @Override
    public void finalizarSimNao(boolean estado) {
        if(estado)
            Toast.makeText(this,"Confirmação efetuada com sucesso", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Confirmação não efetuada", Toast.LENGTH_SHORT).show();
    }
}
