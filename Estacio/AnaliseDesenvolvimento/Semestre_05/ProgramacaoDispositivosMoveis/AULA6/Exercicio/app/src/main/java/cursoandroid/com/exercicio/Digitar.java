package cursoandroid.com.exercicio;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;


public class Digitar extends DialogFragment {
    private EditText txtNome;
    private Button botaoConfirmar;
    static String tituloDialogFragment;
    public interface EntradaDadosDialog{
        void finalizarEntradaDados(String texto);
    }
    public Digitar() {
        // Required empty public constructor
    }
    public void setTituloDialogFragment(String titulo){
        tituloDialogFragment = titulo;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.digitar_layout,container);
        txtNome = (EditText) view.findViewById(R.id.textViewNome);
        botaoConfirmar = (Button) view.findViewById(R.id.btnConfirmar);
        botaoConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EntradaDadosDialog activity = (EntradaDadosDialog) getActivity();
                activity.finalizarEntradaDados(txtNome.getText().toString());
                dismiss();
            }
        });
        txtNome.requestFocus();
        getDialog().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        getDialog().setTitle(tituloDialogFragment);
        return view;
    }
}
