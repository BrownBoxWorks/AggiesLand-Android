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
        title = new String[]{ "Baseball", "Mens Basketball", "Womens Basketball", "Bowling", "Cross Country", "Football", "Softball", "Swimming", "Tennis","Track & Field", "Volleyball"};
        list = (ListView) findViewById(R.id.listView);
        adapter = new AthleteListViewAdapter(this, title);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch(position){
                        case 0:
                            String urlBaseball = "http://www.ncataggies.com/SportSelect.dbml?&DB_OEM_ID=24500&SPID=74515";
                            Uri a = Uri.parse(urlBaseball);
                            startActivity(new Intent(Intent.ACTION_VIEW,a));
                            break;
                        case 1:
                            String urlBasketball = "http://www.ncataggies.com/SportSelect.dbml?DB_OEM_ID=24500&SPID=74518&SPSID=593463";
                            Uri b = Uri.parse(urlBasketball);
                            startActivity(new Intent(Intent.ACTION_VIEW,b));
                            break;
                        case 2:
                            String urlWBaskeball = "http://www.ncataggies.com/SportSelect.dbml?DB_OEM_ID=24500&SPID=74519&SPSID=593465&DB_OEM_ID=24500";
                            Uri wb = Uri.parse(urlWBaskeball);
                            startActivity(new Intent(Intent.ACTION_VIEW,wb));
                            break;
                        case 3:
                            String urlBowling = "http://www.ncataggies.com/SportSelect.dbml?&DB_OEM_ID=24500&SPID=74527&SPSID=594847";
                            Uri c = Uri.parse(urlBowling);
                            startActivity(new Intent(Intent.ACTION_VIEW,c));
                            break;
                        case 4:
                            String urlXC = "http://www.ncataggies.com/SportSelect.dbml?&DB_OEM_ID=24500&SPID=75895&SPSID=595448";
                            Uri d = Uri.parse(urlXC);
                            startActivity(new Intent(Intent.ACTION_VIEW,d));
                            break;

                        case 5:
                            String urlFootball = "http://www.ncataggies.com/SportSelect.dbml?&DB_OEM_ID=24500&SPID=74503&SPSID=593291";
                            Uri e = Uri.parse(urlFootball);
                            startActivity(new Intent(Intent.ACTION_VIEW,e));
                            break;
                        case 6:
                           String urlSoftball = "http://www.ncataggies.com/SportSelect.dbml?&DB_OEM_ID=24500&SPID=74509&SPSID=593321";
                            Uri f = Uri.parse(urlSoftball);
                            startActivity(new Intent(Intent.ACTION_VIEW,f));
                            break;
                        case 7:
                            String urlSwim = "http://www.ncataggies.com/SportSelect.dbml?&DB_OEM_ID=24500&SPID=74507&SPSID=593318";
                            Uri g = Uri.parse(urlSwim);
                            startActivity(new Intent(Intent.ACTION_VIEW,g));
                            break;
                        case 8:
                            String urlTennis = "http://www.ncataggies.com/SportSelect.dbml?&DB_OEM_ID=24500&SPID=74512&SPSID=593342";
                            Uri h = Uri.parse(urlTennis);
                            startActivity(new Intent(Intent.ACTION_VIEW,h));
                            break;
                        case 9:
                            String urlTF = "http://www.ncataggies.com/SportSelect.dbml?&DB_OEM_ID=24500&SPID=74508&SPSID=593320";
                            Uri i = Uri.parse(urlTF);
                            startActivity(new Intent(Intent.ACTION_VIEW,i));
                            break;
                        case 10:
                           String urlVolleyball = "http://www.ncataggies.com/SportSelect.dbml?&DB_OEM_ID=24500&SPID=74514&SPSID=593343";
                            Uri j = Uri.parse(urlVolleyball);
                            startActivity(new Intent(Intent.ACTION_VIEW,j));
                            break;
                        default:
                            break;
                    }

                

            }


        });


    }



    }


