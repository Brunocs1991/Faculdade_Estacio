package cursoandroid.com.aulamensagem_6;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private TextView textViewData;
    private DatePicker dataPicker;
    private Button botaoAlterarData;
    private int ano,mes,dia;
    static final int DATE_DIALOG_ID = 999;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setCurrentDateOnView();
        addListnerOnButton();
    }
    public void setCurrentDateOnView(){
        textViewData = (TextView) findViewById(R.id.textViewData);
        dataPicker = (DatePicker) findViewById(R.id.dataPickerResultado);
        final Calendar c = Calendar.getInstance();
        ano = c.get(Calendar.YEAR);
        mes = c.get(Calendar.MONTH);
        dia = c.get(Calendar.DAY_OF_MONTH);
        textViewData.setText(new StringBuilder().append(dia).append("-").append(mes +1).append("-").append(ano).append(" "));
        dataPicker.init(ano, mes, dia, null);
    }
    public void addListnerOnButton(){
        botaoAlterarData = (Button) findViewById(R.id.botaoAlterarData);
        botaoAlterarData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DATE_DIALOG_ID);
            }
        });
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        switch(id){
            case DATE_DIALOG_ID:
                return  new DatePickerDialog(this, datePickerListener,ano, mes,dia);
        }
        return null;
    }
    private DatePickerDialog.OnDateSetListener datePickerListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int anoSelecionado, int mesSelencionado, int diaSelecionado){
            ano = anoSelecionado;
            mes = mesSelencionado;
            dia = diaSelecionado;
            textViewData.setText(new StringBuilder().append(dia).append("-").append(mes+1).append("-").append(ano).append(" "));
            dataPicker.init(ano,mes,dia, null);
        }
    };
}
