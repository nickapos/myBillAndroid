package mybillandroid.oncrete.gr.mybillandroid.Activities;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nickapos on 08/03/15.
 */
public class MainCategoriesMenuFragment extends ListFragment {
    String[] mainMenuItem = new String[]{"Expenses", "Income", "Companies", "Categories", "Reports"};
    List<String> menuitemList = new ArrayList<String>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_categories_menu_list_fragment, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, mainMenuItem);
        setListAdapter(adapter);
        return view;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        MainCategoriesContentListFragment txt = (MainCategoriesContentListFragment) getFragmentManager().findFragmentById(R.id.fragment2);
        //populate the menu item list
        menuitemList.clear();
        menuitemList.add("blah1");
        menuitemList.add("blah2");
        txt.change(mainMenuItem[position], menuitemList);
        getListView().setSelector(android.R.color.holo_blue_dark);
    }
}