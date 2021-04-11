package cursoandroid.com.aulamenu_3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.adicionar:
                count = (TextView) findViewById(R.id.textView);
                count.setText("Adicionar Item");
                return (true);
            case R.id.reset:
                count = (TextView) findViewById(R.id.textView);
                count.setText("Voltar");
                return (true);
            case R.id.about:
                Toast.makeText(this,R.string.about_toast, Toast.LENGTH_LONG).show();
                return (true);
            case R.id.exit:
                finish();
                return (true);
        }
        return (super.onOptionsItemSelected(item));
    }
}
