package cursoandroid.com.aula4intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.security.Principal;

public class Segunda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TextView tv = new TextView(this);
        tv.setText("Segunda Activity");
        setContentView(R.layout.activity_segunda);
        Bundle extras = getIntent().getExtras();
        Button button1 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Primeira.class);
                startActivity(i);
            }
        });
    }
}
