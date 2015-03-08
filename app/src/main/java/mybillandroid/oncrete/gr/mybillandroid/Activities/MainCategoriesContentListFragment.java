package mybillandroid.oncrete.gr.mybillandroid.Activities;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by nickapos on 08/03/15.
 */


public class MainCategoriesContentListFragment extends Fragment {
    TextView mainMenu;
    ListView mainMenuItems;
    // This is the Adapter being used to display the list's data


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_categories_content_list_fragment, container, false);
        mainMenuItems = (ListView) view.findViewById(R.id.MainMenuListView);
        return view;
    }

    public void change(List<String> txt1) {

        // This is the array adapter, it takes the context of the activity as a
        // first parameter, the type of list view as a second parameter and your
        // array as a third parameter.
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                getActivity().getApplicationContext(),
                android.R.layout.simple_list_item_1,
                txt1 );
        mainMenuItems.setAdapter(arrayAdapter);

    }
}