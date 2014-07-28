package com.lbbw.AggiesLand.aggiesland.app;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by Quis on 7/22/2014.
 */
public class AthleteListView extends Activity {
    ListView list;
    AthleteListViewAdapter adapter;
    String[] title;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.athletelistview);
        title = new String[]{ "Baseball", "Basketball", "Bowling", "Cross Country", "Football", "Softball", "Swimming", "Tennis", "Volleyball"};
        list = (ListView) findViewById(R.id.listView);
        adapter = new AthleteListViewAdapter(this, title);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch(position){
                        case 1:
                            String url =  "http://www.facebook.com";
                            Uri l = Uri.parse(url);
                            startActivity(new Intent(Intent.ACTION_VIEW,l));
                            break;

                        default:
                            break;
                    }

                

            }


        });


    }



    }


