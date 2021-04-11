package cursoandroid.com.aulamenu_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.item1:
                Toast.makeText(getApplicationContext(),"Usado para dispositivos Android", Toast.LENGTH_LONG).show();
            case R.id.item2:
                Toast.makeText(getApplicationContext(),"Usado para dispositivos Apple", Toast.LENGTH_LONG).show();
            case R.id.item3:
                Toast.makeText(getApplicationContext(),"Usado para dispositivos Windows", Toast.LENGTH_LONG).show();
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
