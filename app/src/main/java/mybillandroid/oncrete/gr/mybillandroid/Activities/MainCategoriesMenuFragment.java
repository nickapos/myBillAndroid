package mybillandroid.oncrete.gr.mybillandroid.Activities;

import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import mybillandroid.oncrete.gr.mybillandroid.BusinessLogic.MyBillApplication;
import mybillandroid.oncrete.gr.mybillandroid.CustomAdapters.MainCategoriesAdapter;
import mybillandroid.oncrete.gr.mybillandroid.Objects.MainCategoriesListObject;

/**
 * Created by nickapos on 08/03/15.
 */
public class MainCategoriesMenuFragment extends ListFragment {
    /*
        this variable is initialized in onCreateView since it needs access to context in order for getString to work properly.
        the context before that method is null
     */
    //String[] mainMenuItems;
    MainCategoriesAdapter mainCategoriesAdapter;
    List<MainCategoriesListObject> mainMenuObjectsList;

    MyBillApplication applicationContext;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        applicationContext = ((MyBillApplication) this.getActivity().getApplicationContext());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        applicationContext = ((MyBillApplication) this.getActivity().getApplicationContext());

        initializeMainMenuObjectsList();

//        mainMenuItems = new String[]{
//                getString(R.string.title_expenses_section),
//                getString(R.string.title_income_section),
//                getString(R.string.title_companies_section),
//                getString(R.string.title_categories_section),
//                getString(R.string.title_reports_section)};

        View view = inflater.inflate(R.layout.fragment_list_main_categories_menu, container, false);

        mainCategoriesAdapter = new MainCategoriesAdapter(getActivity(), mainMenuObjectsList);

        setListAdapter(mainCategoriesAdapter);

        return view;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        //String menuitemOptionsHeader="Please select the desired action";
        List<String> menuitemOptionsList = new ArrayList<>();

        MainCategoriesMenuContentListFragment mainCategoriesMenuContentListFragment = (MainCategoriesMenuContentListFragment) getFragmentManager().findFragmentById(R.id.main_categories_menu_content_fragment);

        // populate the menu options list
        menuitemOptionsList.clear();
        //menuitemOptionsList.add(menuitemOptionsHeader);

        switch (position){
            case 4:
                menuitemOptionsList.add("View income reports");
                menuitemOptionsList.add("View expenses reports");
                break;
            default:

//                menuitemOptionsList.add("View " + applicationContext.MainMenuItems[position] + " records");
//                menuitemOptionsList.add("Add " + applicationContext.MainMenuItems[position] + " record");
//                menuitemOptionsList.add("Edit " + applicationContext.MainMenuItems[position] + " records");
//                menuitemOptionsList.add("Delete " + applicationContext.MainMenuItems[position] + " records");

                for (int i=0;i<applicationContext.MainMenuContentActions.length;i++){
                    menuitemOptionsList.add(applicationContext.MainMenuContentActions[i] + " " + applicationContext.MainMenuItems[position] + " records");
                }

                break;
        }

        mainCategoriesMenuContentListFragment.change(menuitemOptionsList);

        getListView().setSelector(android.R.color.holo_blue_dark);
    }


    private void hideMainMenuTextViews(){
        for (TextView tmpTxtView : mainCategoriesAdapter.textViewList) {
            tmpTxtView.setVisibility(View.GONE);
        }
    }

    private void initializeMainMenuObjectsList() {
        mainMenuObjectsList = new ArrayList<>();

        mainMenuObjectsList.add(new MainCategoriesListObject(R.drawable.expenses, getString(R.string.title_expenses_section)));
        mainMenuObjectsList.add(new MainCategoriesListObject(R.drawable.income, getString(R.string.title_income_section)));
        mainMenuObjectsList.add(new MainCategoriesListObject(R.drawable.companies, getString(R.string.title_companies_section)));
        mainMenuObjectsList.add(new MainCategoriesListObject(R.drawable.categories, getString(R.string.title_categories_section)));
        mainMenuObjectsList.add(new MainCategoriesListObject(R.drawable.reports, getString(R.string.title_reports_section)));

    }
}