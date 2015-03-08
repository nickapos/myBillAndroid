package mybillandroid.oncrete.gr.mybillandroid.Activities;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by nickapos on 08/03/15.
 */
public class MenuFragment extends ListFragment {
    String[] AndroidOS = new String[]{"Expenses", "Income", "Companies", "Categories", "Reports"};
    String[] Version = new String[]{"1.5", "1.6", "2.0-2.1", "2.2", "2.3"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_list_fragment, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, AndroidOS);
        setListAdapter(adapter);
        return view;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        TextFragment txt = (TextFragment) getFragmentManager().findFragmentById(R.id.fragment2);
        txt.change(AndroidOS[position], "Version : " + Version[position]);
        getListView().setSelector(android.R.color.holo_blue_dark);
    }
}