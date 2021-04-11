package cursoandroid.com.aulamensagem_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button botao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botao = (Button) findViewById(R.id.botao);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater =getLayoutInflater();
                View layout = inflater.inflate(R.layout.mensagem_main_xml,(ViewGroup) findViewById(R.id.custom_toast_layout_id));

                ImageView image = (ImageView) layout.findViewById(R.id.imagem);
                image.setImageResource(R.mipmap.ic_launcher);
                TextView text = (TextView) layout.findViewById(R.id.texto);
                text.setText("Obrigado por efetuar o click");

                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);
                toast.show();
            }
        });
    }
}
