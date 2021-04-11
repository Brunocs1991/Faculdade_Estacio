package cursoandroid.com.exercicio;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Confirmar extends DialogFragment{

    private Button botaoSim, botaoNao;
    static String tituloDialodFragment;
    public interface SimNaoDialog{
        void finalizarSimNao(boolean estado);
    }
    public Confirmar() {
    }
    public void setDialogTitle(String titulo){
        tituloDialodFragment = titulo;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.confirmar_layout,container);

        botaoSim = (Button) view.findViewById(R.id.botaoSim);
        botaoNao = (Button) view.findViewById(R.id.botaoNao);

        botaoSim.setOnClickListener(btnListener);
        botaoNao.setOnClickListener(btnListener);
         getDialog().setTitle(tituloDialodFragment);
         return view;
    }
    private View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SimNaoDialog activity = (SimNaoDialog) getActivity();
            boolean state = ((Button)v).getText().toString().equals("sim") ? true : false;
            activity.finalizarSimNao(state);
            dismiss();
        }
    };
}


