package mybillandroid.oncrete.gr.mybillandroid.Activities;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by nickapos on 08/03/15.
 */


public class MainCategoriesContentListFragment extends Fragment {
    TextView text, vers;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_categories_content_list_fragment, container, false);
        text = (TextView) view.findViewById(R.id.AndroidOs);
        vers = (TextView) view.findViewById(R.id.Version);
        return view;
    }

    public void change(String txt, String txt1) {
        text.setText(txt);
        vers.setText(txt1);
    }
}