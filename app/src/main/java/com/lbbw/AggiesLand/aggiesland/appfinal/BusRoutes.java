package com.lbbw.AggiesLand.aggiesland.appfinal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
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
                        String url = "http://www.rideheat.com/sites/www.rideheat.com/files/pdf/71MF.pdf";
                        Uri a = Uri.parse(url);
                        startActivity(new Intent(Intent.ACTION_VIEW,a));
                        break;
                    case 1:
                        url = "http://www.rideheat.com/sites/www.rideheat.com/files/pdf/71SS.pdf";
                        Uri b = Uri.parse(url);
                        startActivity(new Intent(Intent.ACTION_VIEW,b));
                        break;
                    case 2:
                        url = "http://www.rideheat.com/sites/www.rideheat.com/files/pdf/72.pdf";
                        Uri c = Uri.parse(url);
                        startActivity(new Intent(Intent.ACTION_VIEW,c));
                        break;
                    case 3:
                        url = "http://www.rideheat.com/sites/www.rideheat.com/files/pdf/73.pdf";
                        Uri d = Uri.parse(url);
                        startActivity(new Intent(Intent.ACTION_VIEW,d));
                        break;
                    case 4:
                        url = "http://www.rideheat.com/sites/www.rideheat.com/files/pdf/75.pdf";
                        Uri e = Uri.parse(url);
                        startActivity(new Intent(Intent.ACTION_VIEW,e));
                        break;
                }
            }
        });


    }



}
