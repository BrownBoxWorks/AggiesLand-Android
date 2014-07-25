package com.lbbw.AggiesLand.aggiesland.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by BTX17-1 on 7/23/2014.
 */
public class CampusEventsSingleItemView extends Activity {
    String dateDetail;
    String eventNameDetail;
    String locationDetail;
    String details;
    String imageDetail;
    ImageLoader imageLoader = new ImageLoader(this);

    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.campuseventsitemview);

        Intent i = getIntent();
        dateDetail = i.getStringExtra("Date");
        eventNameDetail = i.getStringExtra("EventName");
        locationDetail = i.getStringExtra("Location");
        details = i.getStringExtra("Details");
        imageDetail = i.getStringExtra("imageFile");

        TextView txtdate = (TextView) findViewById(R.id.date);
        TextView txteventname = (TextView) findViewById(R.id.eventName);
        TextView txtlocation = (TextView) findViewById(R.id.location);
        TextView txtdetails = (TextView) findViewById(R.id.detail);

        ImageView img = (ImageView) findViewById(R.id.imageView);

        txtdate.setText(dateDetail);
        txteventname.setText(eventNameDetail);
        txtlocation.setText(locationDetail);
        txtdetails.setText(details);

        imageLoader.DisplayImage(imageDetail,img);



    }

}
