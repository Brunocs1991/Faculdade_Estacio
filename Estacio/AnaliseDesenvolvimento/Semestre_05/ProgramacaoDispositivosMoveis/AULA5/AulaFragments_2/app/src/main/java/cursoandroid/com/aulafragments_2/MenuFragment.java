package cursoandroid.com.aulafragments_2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;


public class MenuFragment extends ListFragment {
    String[] sistemasOperacionais = new String[]{"Android","IOS","Windows Mobile","BlackBerry"};
    String[] descricao = new String[]{"criado pelo Google","criado pela Apple","criado pela Microsoft","criado pela RIM"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment,container,false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,sistemasOperacionais);
        setListAdapter(adapter);
        return view;
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull android.view.View v, int position, long id) {
        TextFragment txt = (TextFragment)getFragmentManager().findFragmentById(R.id.fragment2);
        txt.change(sistemasOperacionais[position],"SO " + descricao[position]);
        getListView().setSelection(android.R.color.holo_orange_light);
    }
}
