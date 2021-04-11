package cursoandroid.com.aulafragments_2;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TextFragment extends Fragment {
    TextView text,vers;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_text,container,false);
        text = (TextView) view.findViewById(R.id.sistOperacional);
        vers = (TextView) view.findViewById(R.id.descricao);
        return view;
    }
    public void change (String txt, String txt1){
        text.setText(txt);
        vers.setText(txt1);
    }
}
