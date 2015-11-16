package mybillandroid.oncrete.gr.mybillandroid.Objects;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.BaseAdapter;

import mybillandroid.oncrete.gr.mybillandroid.Activities.AddContentActivityFragment;

/**
 * Created by christos on 24/10/15.
 */
public class MainCategoriesListObject {

    public int itemImageID;
    public String itemTitle;

    /**
     *
     * @param itemImageID
     * @param itemTitle
     */
    public MainCategoriesListObject(int itemImageID, String itemTitle) {
        this.itemImageID = itemImageID;
        this.itemTitle = itemTitle;
    }

}
