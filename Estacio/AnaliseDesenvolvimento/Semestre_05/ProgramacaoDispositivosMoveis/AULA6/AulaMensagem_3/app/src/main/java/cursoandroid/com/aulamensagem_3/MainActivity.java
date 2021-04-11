package cursoandroid.com.aulamensagem_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botaoIniciar;
    private NotificationCompat.Builder notification;
    private PendingIntent pendingIntent;
    private NotificationManager manager;
    private Intent resultadoIntent;
    private TaskStackBuilder stackBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botaoIniciar = (Button) findViewById(R.id.botaoIniciar);
        botaoIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNotification();
            }
            protected void startNotification(){
                notification = new NotificationCompat.Builder(MainActivity.this);
                notification.setContentTitle("Notificação Aluno Bruno");
                notification.setContentText("Isto é um teste de Notificação Android");
                notification.setTicker("Atenção Notificação");
                notification.setSmallIcon(R.mipmap.ic_launcher);
                stackBuilder = TaskStackBuilder.create(MainActivity.this);
                stackBuilder.addParentStack(Resultado.class);
                resultadoIntent = new Intent(MainActivity.this, Resultado.class);
                stackBuilder.addNextIntent(resultadoIntent);
                pendingIntent = stackBuilder.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);
                notification.setContentIntent(pendingIntent);
                manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                manager.notify(0,notification.build());
            }
        });
    }
}
