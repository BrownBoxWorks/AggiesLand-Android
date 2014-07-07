package com.lbbw.AggiesLand.aggiesland.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by BTX17-1 on 6/21/2014.
 */
public class ClubSingleItemView extends Activity {
    String dateDetail;
    String titleDetail;
    String clubNameDetail;
    String addressDetail;
    String priceDetail;
    String detail;
    String imageDetail;
    ImageLoader imageLoader = new ImageLoader(this);


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clubsingleitemview);


        Intent i = getIntent();
        dateDetail = i.getStringExtra("Date");
        titleDetail = i.getStringExtra("Title");
        clubNameDetail = i.getStringExtra("ClubName");
        addressDetail = i.getStringExtra("Address");
        priceDetail = i.getStringExtra("Price");
        detail = i.getStringExtra("Details");
        imageDetail = i.getStringExtra("imageFile");

        TextView txtdate = (TextView) findViewById(R.id.date);
        TextView txttitle = (TextView) findViewById(R.id.title);
        TextView txtclubname = (TextView) findViewById(R.id.clubname);
        TextView txtaddress = (TextView) findViewById(R.id.address);
        TextView txtprice = (TextView) findViewById(R.id.price);
        TextView txtdetail = (TextView) findViewById(R.id.detail);

        ImageView img = (ImageView) findViewById(R.id.imageView);

        txtdate.setText(dateDetail);
        txttitle.setText(titleDetail);
        txtclubname.setText(clubNameDetail);
        txtaddress.setText(addressDetail);
        txtprice.setText(priceDetail);
        txtdetail.setText(detail);

        imageLoader.DisplayImage(imageDetail,img);





    }
}
