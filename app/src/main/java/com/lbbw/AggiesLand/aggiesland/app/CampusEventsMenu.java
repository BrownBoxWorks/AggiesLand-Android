package com.lbbw.AggiesLand.aggiesland.app;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.view.View;

/**
 * Created by BTX17-1 on 7/15/2014.
 */
public class CampusEventsMenu extends Activity {

    ListView list;
    CampusEventMenuAdapter adapter;
    String [] title;
    int [] picture;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.campuseventoptionslist_main);

        title = new String[]{"Special Campus Events","Athletics"};
        picture = new int[]{R.drawable.special_events_page,R.drawable.aggie_athletics_page};


        list = (ListView) findViewById(R.id.listView);

        adapter = new CampusEventMenuAdapter(this, title, picture);

        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        Intent myIntent = new Intent(CampusEventsMenu.this, CampusEventActivity.class);
                        CampusEventsMenu.this.startActivity(myIntent);
                        break;

                    case 1:
                        Intent intent = new Intent(CampusEventsMenu.this, AthleteListView.class);
                        CampusEventsMenu.this.startActivity(intent);
                        break;

                    default:
                        break;
                }



            }


        });


    }










}
