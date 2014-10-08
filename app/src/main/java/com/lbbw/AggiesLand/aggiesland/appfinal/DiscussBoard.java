package com.lbbw.AggiesLand.aggiesland.appfinal;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

/**
 * Created by Quis on 10/7/2014.
 */
public class DiscussBoard extends Activity {
    ListView messageListView;
    EditText comment;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.discussboard);
    }
}