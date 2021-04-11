package cursoandroid.com.aulalistview_2;


import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.app.ListActivity;

public class MainActivity extends ListActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.output);
        String[] diasSemana = new String[]{"Domingo","Segunda-Feira","Terça-Feira","Quarta-feira",
                                            "Quinta-feira","Sexta-feira","Sábado"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,diasSemana);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        int i = position+1;
        String dia = (String) l.getItemAtPosition(position);
        textView.setText("Ordem na semana: "+ (i) + "        Dia: " + dia);
    }
}
