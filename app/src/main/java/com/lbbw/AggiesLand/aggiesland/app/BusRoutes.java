package com.lbbw.AggiesLand.aggiesland.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * Created by Quis on 7/31/2014.
 */
public class BusRoutes extends Activity {

    ListView list;
    BusRoutesAdapter adapter;
    String [] title;


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.busroutesview);
        title = new String []{"71-East/West","71-East/West(Weekends)","72-City Heat","73-UNCG Heat","75-NC A&T Heat"};
        list = (ListView) findViewById(R.id.busListView);
        adapter = new BusRoutesAdapter(this, title);
        list.setAdapter(adapter);

    }










}
