package mybillandroid.oncrete.gr.mybillandroid.Activities;

import android.app.ListFragment;
import android.content.Context;
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

    String[] mainMenuItems;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mainMenuItems = new String[]{getString(R.string.title_expenses_section),
                getString(R.string.title_income_section),
                getString(R.string.title_companies_section),
                getString(R.string.title_categories_section),
                getString(R.string.title_reports_section)};
        View view = inflater.inflate(R.layout.main_categories_menu_list_fragment, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, mainMenuItems);
        setListAdapter(adapter);
        return view;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        String menuitemOptionsHeader="Please select the desired action";
        List<String> menuitemOptionsList = new ArrayList<String>();
        MainCategoriesContentListFragment txt = (MainCategoriesContentListFragment) getFragmentManager().findFragmentById(R.id.fragment2);
        //populate the menu options list
        menuitemOptionsList.clear();
        menuitemOptionsList.add(menuitemOptionsHeader);
        if(position!=4) {
            menuitemOptionsList.add("View "+mainMenuItems[position]+" records");
            menuitemOptionsList.add("Add "+mainMenuItems[position]+" record");
            menuitemOptionsList.add("Edit "+mainMenuItems[position]+" records");
            menuitemOptionsList.add("Delete "+mainMenuItems[position]+" records");
        } else{
            menuitemOptionsList.add("View income reports");
            menuitemOptionsList.add("View expenses reports");
        }
        txt.change(menuitemOptionsList);
        getListView().setSelector(android.R.color.holo_blue_dark);
    }
}