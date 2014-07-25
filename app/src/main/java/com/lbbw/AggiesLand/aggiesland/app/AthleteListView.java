package com.lbbw.AggiesLand.aggiesland.app;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * Created by Quis on 7/22/2014.
 */
public class AthleteListView extends ListActivity {
    ListView list;
    AthleteListViewAdapter adapter;
    String [] title;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.athletelistview);
        title = new String[]{"Athletic Teams"};
        list = (ListView) findViewById(R.id.aList);
        adapter = new AthleteListViewAdapter(this, title);
        list.setAdapter(adapter);
    }

}
