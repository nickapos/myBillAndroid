package mybillandroid.oncrete.gr.mybillandroid.BusinessLogic;

import android.app.Application;

/**
 * Created by christos on 16/11/15.
 */
public class MyBillApplication extends Application{

    public String[] MainMenuItems;
    public String[] MainMenuContentActions;

    private String currentSelectedMainMenuContentActionItem;

    public MyBillApplication() {
        MainMenuItems = new String[]{
                "Expenses",
                "Income",
                "Companies",
                "Categories",
                "Reports"
        };

        MainMenuContentActions = new String[]{
                "View",
                "Add",
                "Edit",
                "Delete"
        };

        currentSelectedMainMenuContentActionItem = "";

    }



    public String getCurrentSelectedMainMenuContentActionItem() {
        return currentSelectedMainMenuContentActionItem;
    }

    public void setCurrentSelectedMainMenuContentActionItem(String currentSelectedMainMenuContentActionItem) {
        this.currentSelectedMainMenuContentActionItem = currentSelectedMainMenuContentActionItem;
    }
}
