package com.lbbw.AggiesLand.aggiesland.app;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

import com.google.android.gms.ads.*;

import com.parse.ParseAnalytics;
import com.parse.ParseInstallation;
import com.parse.ParseUser;
import com.parse.PushService;

/**
 * Created by BTX17-1 on 6/27/2014.
 */

public class TabBarActivity extends TabActivity{

    private MenuItem item;
    public Intent option1;
    private Intent login;

    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        // Look up the AdView as a resource and load a request.
        AdView adView = (AdView) this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);


        Resources res = getResources();
        TabHost tabHost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;

        intent = new Intent().setClass(this, NewsActivity.class);
        spec = getTabHost().newTabSpec("News").setIndicator("News",res.getDrawable(R.drawable.ic_launcher)).setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, ClubActivity.class);
        spec = getTabHost().newTabSpec("Clubs").setIndicator("Clubs",res.getDrawable(R.drawable.ic_launcher)).setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, CampusEventsMenu.class);
        spec = getTabHost().newTabSpec("Campus Events").setIndicator("Campus Events",res.getDrawable(R.drawable.ic_launcher)).setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, BusRoutes.class);
        spec = getTabHost().newTabSpec("Bus Routes").setIndicator("Bus Routes",res.getDrawable(R.drawable.ic_launcher)).setContent(intent);
        tabHost.addTab(spec);

        //




       PushService.setDefaultPushCallback(this, TabBarActivity.class);
        ParseInstallation.getCurrentInstallation().saveInBackground();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main,menu);
        return true;
    }

   @Override
   public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId()){
            case R.id.email_event:
             // option1 = new Intent(this, EmailSender.class);
                startActivity(new Intent(this,EmailSender.class));
                return true;

            case R.id.twitter_event:
                String tweetUrl = "https://twitter.com/intent/tweet?text=@AggiesLand Event Post &url="
                        + "https://www.google.com";
                Uri uri = Uri.parse(tweetUrl);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
                return true;


            case R.id.logout:
                ParseUser.logOut();
                ParseUser currentUser = ParseUser.getCurrentUser();
                startActivity(new Intent(this,LoginActivity.class));
            default:
                return super.onContextItemSelected(item);

        }

    }

    }
 
