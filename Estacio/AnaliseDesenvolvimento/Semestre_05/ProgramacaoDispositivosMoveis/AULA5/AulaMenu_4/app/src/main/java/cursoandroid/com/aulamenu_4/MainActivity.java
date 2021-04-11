package cursoandroid.com.aulamenu_4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Chronometer c = (Chronometer) findViewById(R.id.chronometer1) ;
        registerForContextMenu(c);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        if(v.getId() == R.id.chronometer1){
            getMenuInflater().inflate(R.menu.startstopmenu,menu);
            menu.setHeaderIcon(android.R.drawable.ic_media_play);
            menu.setHeaderTitle("Timer Control");
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getTitle().toString().equals("Start")){
            Chronometer c = (Chronometer) findViewById(R.id.chronometer1);
            c.start();
        }else if(item.getTitle().toString().equals("Stop")){
            Chronometer c = (Chronometer) findViewById(R.id.chronometer1);
            c.stop();
        }else if(item.getTitle().toString().equals("Reset")){
            Chronometer c = (Chronometer) findViewById(R.id.chronometer1);
            c.setBase(SystemClock.elapsedRealtime());
            c.start();
        }
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.startstopmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
