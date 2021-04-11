package cursoandroid.com.aulapersistence_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private DBManager dbManager;
    private ListView listView;
    private SimpleCursorAdapter adapter;
    final String[] pessoaOrigem = new String []{
            DBHelper._ID, DBHelper.NOME, DBHelper.EMAIL
    };
    final int[] pessoaDestino = new int[]{ R.id.id, R.id.title, R.id.desc};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbManager = new DBManager(this);
        dbManager.open();
        Cursor cursor = dbManager.fetch();
        listView = (ListView) findViewById(R.id.list_view);
        listView.setEmptyView(findViewById(R.id.textViewListaVazia));

        adapter = new SimpleCursorAdapter(this, R.layout.visualizar_registros_main, cursor,pessoaOrigem,pessoaDestino, 0);
        adapter.notifyDataSetChanged();

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long viewId) {
                TextView idTextView = (TextView) findViewById(R.id.id);
                TextView titleTextView = (TextView) findViewById(R.id.title);
                TextView descTextView = (TextView) findViewById(R.id.desc);

                String id = idTextView.getText().toString();
                String nome = titleTextView.getText().toString();
                String email = descTextView.getText().toString();

                Intent modify_intent = new Intent(getApplicationContext(), Atualizar_activity.class);
                modify_intent.putExtra("title", nome);
                modify_intent.putExtra("desc", email);
                modify_intent.putExtra("id", id);
                startActivity(modify_intent);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id= item.getItemId();
        if(id == R.id.botaoAdicionar){
            Intent intent = new Intent(this, Adicionar_activity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
