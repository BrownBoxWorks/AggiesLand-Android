package com.lbbw.AggiesLand.aggiesland.appfinal;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
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
        title = new String[]{ "Baseball", "Basketball", "Bowling", "Cross Country", "Football", "Softball", "Swimming", "Tennis","Track & Field", "Volleyball"};
        list = (ListView) findViewById(R.id.listView);
        adapter = new AthleteListViewAdapter(this, title);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch(position){
                        case 0:
                            String url = "http://www.ncataggies.com/SportSelect.dbml?&DB_OEM_ID=24500&SPID=74515";
                            Uri a = Uri.parse(url);
                            startActivity(new Intent(Intent.ACTION_VIEW,a));
                            break;
                        case 1:
                             url = "http://www.ncataggies.com/SportSelect.dbml?DB_OEM_ID=24500&SPID=74518&SPSID=593463";
                            Uri b = Uri.parse(url);
                            startActivity(new Intent(Intent.ACTION_VIEW,b));
                            break;
                        case 2:
                            url = "http://www.ncataggies.com/SportSelect.dbml?&DB_OEM_ID=24500&SPID=74527&SPSID=594847";
                            Uri c = Uri.parse(url);
                            startActivity(new Intent(Intent.ACTION_VIEW,c));
                            break;
                        case 3:
                            url = "http://www.ncataggies.com/SportSelect.dbml?&DB_OEM_ID=24500&SPID=75895&SPSID=595448";
                            Uri d = Uri.parse(url);
                            startActivity(new Intent(Intent.ACTION_VIEW,d));

                        case 4:
                            url = "http://www.ncataggies.com/SportSelect.dbml?&DB_OEM_ID=24500&SPID=74503&SPSID=593291";
                            Uri e = Uri.parse(url);
                            startActivity(new Intent(Intent.ACTION_VIEW,e));
                        case 5:
                            url = "http://www.ncataggies.com/SportSelect.dbml?&DB_OEM_ID=24500&SPID=74509&SPSID=593321";
                            Uri f = Uri.parse(url);
                            startActivity(new Intent(Intent.ACTION_VIEW,f));
                        case 6:
                            url = "http://www.ncataggies.com/SportSelect.dbml?&DB_OEM_ID=24500&SPID=74507&SPSID=593318";
                            Uri g = Uri.parse(url);
                            startActivity(new Intent(Intent.ACTION_VIEW,g));
                        case 7:
                            url = "http://www.ncataggies.com/SportSelect.dbml?&DB_OEM_ID=24500&SPID=74512&SPSID=593342";
                            Uri h = Uri.parse(url);
                            startActivity(new Intent(Intent.ACTION_VIEW,h));
                        case 8:
                            url = "http://www.ncataggies.com/SportSelect.dbml?&DB_OEM_ID=24500&SPID=74508&SPSID=593320";
                            Uri i = Uri.parse(url);
                            startActivity(new Intent(Intent.ACTION_VIEW,i));
                        case 9:
                            url = "http://www.ncataggies.com/SportSelect.dbml?&DB_OEM_ID=24500&SPID=74514&SPSID=593343";
                            Uri j = Uri.parse(url);
                            startActivity(new Intent(Intent.ACTION_VIEW,j));
                        default:
                            break;
                    }

                

            }


        });


    }



    }


