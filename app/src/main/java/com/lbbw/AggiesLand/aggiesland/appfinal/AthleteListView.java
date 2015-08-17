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
                            setContentView(R.layout.ncatregister);
                            WebView baseball = (WebView) findViewById(R.id.webview);
                            baseball.loadUrl("http://www.ncataggies.com/SportSelect.dbml?&DB_OEM_ID=24500&SPID=74515");
                            break;
                        case 1:
                            setContentView(R.layout.ncatregister);
                            WebView basketball = (WebView) findViewById(R.id.webview);
                            basketball.loadUrl("http://www.ncataggies.com/SportSelect.dbml?DB_OEM_ID=24500&SPID=74518&SPSID=593463");
                            break;
                        case 2:
                            setContentView(R.layout.ncatregister);
                            WebView wbBasketball = (WebView) findViewById(R.id.webview);
                            wbBasketball.loadUrl("http://www.ncataggies.com/SportSelect.dbml?DB_OEM_ID=24500&SPID=74519&SPSID=593465&DB_OEM_ID=24500");
                            break;
                        case 3:
                            setContentView(R.layout.ncatregister);
                            WebView bowling = (WebView) findViewById(R.id.webview);
                            bowling.loadUrl("http://www.ncataggies.com/SportSelect.dbml?&DB_OEM_ID=24500&SPID=74527&SPSID=594847");
                            break;
                        case 4:
                            setContentView(R.layout.ncatregister);
                            WebView xc = (WebView) findViewById(R.id.webview);
                            xc.loadUrl("http://www.ncataggies.com/SportSelect.dbml?&DB_OEM_ID=24500&SPID=75895&SPSID=595448");
                            break;
                        case 5:
                            setContentView(R.layout.ncatregister);
                            WebView football = (WebView) findViewById(R.id.webview);
                            football.loadUrl("http://www.ncataggies.com/SportSelect.dbml?&DB_OEM_ID=24500&SPID=74503&SPSID=593291");
                            break;
                        case 6:
                            setContentView(R.layout.ncatregister);
                            WebView softball = (WebView) findViewById(R.id.webview);
                            softball.loadUrl("http://www.ncataggies.com/SportSelect.dbml?&DB_OEM_ID=24500&SPID=74509&SPSID=593321");
                            break;
                        case 7:
                            setContentView(R.layout.ncatregister);
                            WebView swimming = (WebView) findViewById(R.id.webview);
                            swimming.loadUrl("http://www.ncataggies.com/SportSelect.dbml?&DB_OEM_ID=24500&SPID=74507&SPSID=593318");
                            break;
                        case 8:
                            setContentView(R.layout.ncatregister);
                            WebView tennis = (WebView) findViewById(R.id.webview);
                            tennis.loadUrl("http://www.ncataggies.com/SportSelect.dbml?&DB_OEM_ID=24500&SPID=74512&SPSID=593342");
                            break;
                        case 9:
                            setContentView(R.layout.ncatregister);
                            WebView track = (WebView) findViewById(R.id.webview);
                            track.loadUrl("http://www.ncataggies.com/SportSelect.dbml?&DB_OEM_ID=24500&SPID=74508&SPSID=593320");
                            break;
                        case 10:
                            setContentView(R.layout.ncatregister);
                            WebView volleyball = (WebView) findViewById(R.id.webview);
                            volleyball.loadUrl("http://www.ncataggies.com/SportSelect.dbml?&DB_OEM_ID=24500&SPID=74514&SPSID=593343");
                            break;
                        default:
                            break;
                    }

                

            }


        });


    }



    }


