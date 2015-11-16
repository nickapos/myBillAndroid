package mybillandroid.oncrete.gr.mybillandroid.CustomAdapters;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import mybillandroid.oncrete.gr.mybillandroid.Activities.R;
import mybillandroid.oncrete.gr.mybillandroid.Objects.MainCategoriesListObject;

/**
 * Created by christos on 24/10/15.
 */
public class MainCategoriesAdapter extends ArrayAdapter<MainCategoriesListObject> {

    private Activity context;
    public List<TextView> textViewList;

    private List<MainCategoriesListObject> objectsList;

    public MainCategoriesAdapter( Activity context, List<MainCategoriesListObject> objectsList) {
        super(context, R.layout.main_categories_menu_list_item, objectsList);

        this.context = context;
        this.objectsList = objectsList;

        textViewList = new ArrayList<>();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rowView = convertView;
        if (rowView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.main_categories_menu_list_item, parent, false);
        }

        MainCategoriesListObject tmpMainCategoriesListObject = objectsList.get(position);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.listitem_imageView_itemPhoto);
        TextView txtViewTitle = (TextView) rowView.findViewById(R.id.listitem_textView_itemName);

        imageView.setImageResource(tmpMainCategoriesListObject.itemImageID);
        txtViewTitle.setText(tmpMainCategoriesListObject.itemTitle);

        textViewList.add(txtViewTitle);

        return rowView;

    };


}
