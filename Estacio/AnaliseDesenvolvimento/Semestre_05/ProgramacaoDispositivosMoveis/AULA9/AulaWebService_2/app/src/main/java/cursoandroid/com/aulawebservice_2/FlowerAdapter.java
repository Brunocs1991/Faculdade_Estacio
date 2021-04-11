package cursoandroid.com.aulawebservice_2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import cursoandroid.com.aulawebservice_2.model.Flor;

public class FlowerAdapter extends ArrayAdapter<Flor> {

    private Context context;
    private List<Flor> listaFlores;

    public FlowerAdapter(@NonNull Context context, int resource, @NonNull List<Flor> objects) {
        super(context, resource, objects);
        this.context = context;
        this.listaFlores = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_flower, parent, false);

        Flor flower = listaFlores.get(position);
        TextView textView = (TextView) view.findViewById(R.id.textView1);
        textView.setText(flower.getNome());

        ImageView imageView = (ImageView) view.findViewById(R.id.imageViwe1);
        imageView.setImageBitmap(flower.getFotoBitmap());

        return view;
    }
}
