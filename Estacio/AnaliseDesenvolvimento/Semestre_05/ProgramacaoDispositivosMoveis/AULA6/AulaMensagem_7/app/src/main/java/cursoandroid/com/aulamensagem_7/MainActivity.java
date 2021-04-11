package cursoandroid.com.aulamensagem_7;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;
import java.util.Timer;

public class MainActivity extends AppCompatActivity {
    private TextView textViewHorario;
    private TimePicker timePicker;
    private Button botaoAlterarHorario;
    private int hora,minuto;
    static final int TIME_DIALOG_ID = 999;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setCurrentTimeOnView();
        addListenerButton();
    }
    public void setCurrentTimeOnView(){
        textViewHorario = (TextView) findViewById(R.id.textViewHorario);
        timePicker = (TimePicker) findViewById(R.id.timePicker);
        final Calendar c = Calendar.getInstance();
        hora = c.get(Calendar.HOUR_OF_DAY);
        minuto = c.get(Calendar.MINUTE);
        textViewHorario.setText(new StringBuilder().append(pad(hora)).append(":").append(pad(minuto)));
        timePicker.setCurrentHour(hora);
        timePicker.setCurrentMinute(minuto);
    }
    public void addListenerButton(){
        botaoAlterarHorario = (Button) findViewById(R.id.botaoAlterarHorario);
        botaoAlterarHorario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(TIME_DIALOG_ID);
            }
        });
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id){
            case TIME_DIALOG_ID:
                return new TimePickerDialog(this,timePickerListener, hora, minuto,false);
        }
        return null;
    }
    private TimePickerDialog.OnTimeSetListener timePickerListener = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int horaSelecionada, int minutoSelecionado) {
            hora = horaSelecionada;
            minuto = minutoSelecionado;
            textViewHorario.setText(new StringBuilder().append(pad(hora)).append(":").append(pad(minuto)));
            timePicker.setCurrentHour(hora);
            timePicker.setCurrentMinute(minuto);
        }
    };
    private static String pad(int c){
        if(c >= 10)
            return String.valueOf(c);
        else
            return "0" + String.valueOf(c);
    }
}
