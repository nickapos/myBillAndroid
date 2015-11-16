package mybillandroid.oncrete.gr.mybillandroid.Activities;

import android.app.Fragment;
import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ArrayAdapter;

import java.util.List;
import java.util.zip.Inflater;

import mybillandroid.oncrete.gr.mybillandroid.BusinessLogic.MyBillApplication;

/**
 * Created by nickapos on 08/03/15.
 */


public class MainCategoriesMenuContentListFragment extends ListFragment {
    TextView mainMenu;
    ListView mainMenuItems;

    MyBillApplication applicationContext;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        applicationContext = ((MyBillApplication) this.getActivity().getApplicationContext());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_main_categories_menu_content, container, false);

        //mainMenuItems = (ListView) view.findViewById(R.id.main_categories_menu_content_listView);

        return view;
    }


    public void change(List<String> stringList) {

        // This is the array adapter, it takes the context of the activity as a
        // first parameter, the type of list view as a second parameter and your
        // array as a third parameter.
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                getActivity().getApplicationContext(),
                android.R.layout.simple_list_item_1,
                stringList );

//        mainMenuItems.setAdapter(arrayAdapter);
        this.setListAdapter(arrayAdapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        // TODO implement some logic
        System.out.println("Click position = " + applicationContext.MainMenuContentActions[position]);

        // Set the selected action to context
        applicationContext.setCurrentSelectedMainMenuContentActionItem(applicationContext.MainMenuContentActions[position]);


        Intent intent = new Intent(this.getActivity(), AddContentActivityFragment.class);

        startActivity(intent);
    }











}