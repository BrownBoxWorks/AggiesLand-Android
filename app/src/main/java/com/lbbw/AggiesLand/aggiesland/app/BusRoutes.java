package com.lbbw.AggiesLand.aggiesland.app;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by Quis on 7/31/2014.
 */
public class BusRoutes extends Activity {

    ListView list;
    BusRoutesAdapter adapter;
    String [] title;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.busroutesview);
        title = new String[]{"71-East/West", "71-East/West(Weekends)", "72-City Heat", "73-UNCG Heat", "75-NC A&T Heat"};
        list = (ListView) findViewById(R.id.busListView);
        adapter = new BusRoutesAdapter(this, title);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        String url = "http://www.greensboro-nc.gov/modules/showdocument.aspx?documentid=23834";
                        Uri a = Uri.parse(url);
                        break;
                    case 1:
                        url = "http://www.greensboro-nc.gov/modules/showdocument.aspx?documentid=23833";
                        Uri b = Uri.parse(url);
                        break;
                    case 2:
                        url = "http://www.greensboro-nc.gov/modules/showdocument.aspx?documentid=23832";
                        Uri c = Uri.parse(url);
                        break;
                    case 3:
                        url = "http://www.greensboro-nc.gov/modules/showdocument.aspx?documentid=23831";
                        Uri d = Uri.parse(url);
                        break;
                    case 4:
                        url = "http://www.greensboro-nc.gov/modules/showdocument.aspx?documentid=23830";
                        Uri e = Uri.parse(url);
                        break;
                }
            }
        });


    }



}
