package mybillandroid.oncrete.gr.mybillandroid.Activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import mybillandroid.oncrete.gr.mybillandroid.Activities.R;

public class AddContentActivityFragment extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_content);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
