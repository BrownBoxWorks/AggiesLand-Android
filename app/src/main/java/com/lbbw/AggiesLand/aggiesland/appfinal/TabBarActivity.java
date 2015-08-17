package com.lbbw.AggiesLand.aggiesland.appfinal;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TabHost;
import android.widget.TextView;

//import com.crashlytics.android.Crashlytics;
//import com.google.android.gms.ads.*;

import com.parse.ParseInstallation;
import com.parse.ParseUser;

/**
 * Created by BTX17-1 on 6/27/2014.
 */

@Deprecated
public class TabBarActivity extends TabActivity{

    private MenuItem item;
    public Intent option1;
    private Intent login;

    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
/*
        // Look up the AdView as a resource and load a request.
        AdView adView = (AdView) this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

*/
        Resources res = getResources();
        TabHost tabHost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;

        for(int i=0;i<tabHost.getTabWidget().getChildCount();i++)
        {
            TextView tv = (TextView) tabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
            tv.setTextColor(Color.parseColor("#FFFFF"));
        }

        tabHost.getTabWidget().setDividerDrawable(null);



        intent = new Intent().setClass(this, NewsActivity.class);
        spec = getTabHost().newTabSpec("News").setIndicator("News",res.getDrawable(R.drawable.ic_launcher)).setContent(intent);
        tabHost.addTab(spec);
        tabHost.setBackgroundColor(Color.WHITE);
/*
        intent = new Intent().setClass(this, ClubActivity.class);
        spec = getTabHost().newTabSpec("Clubs").setIndicator("Parties",res.getDrawable(R.drawable.ic_launcher)).setContent(intent);
        tabHost.addTab(spec);
*/
        intent = new Intent().setClass(this, CampusEventActivity.class);
        spec = getTabHost().newTabSpec("Events").setIndicator("Events",res.getDrawable(R.drawable.ic_launcher)).setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, BusRoutes.class);
        spec = getTabHost().newTabSpec("Routes").setIndicator("Routes",res.getDrawable(R.drawable.ic_launcher)).setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, AthleteListView.class);
        spec = getTabHost().newTabSpec("Sports").setIndicator("Sports",res.getDrawable(R.drawable.ic_launcher)).setContent(intent);
        tabHost.addTab(spec);
/*
        intent = new Intent().setClass(this, BusinessActivity.class);
        spec = getTabHost().newTabSpec("Business").setIndicator("Business",res.getDrawable(R.drawable.ic_launcher)).setContent(intent);
        tabHost.addTab(spec);
*/
        //




       //PushService.setDefaultPushCallback(this, TabBarActivity.class);
        //ParseInstallation.getCurrentInstallation().saveInBackground();
    }
    @Override
    public void onResume(){
        super.onResume();

        TabHost tabHost = getTabHost();

            for(int i=0;i<tabHost.getTabWidget().getChildCount();i++)
            {
                TextView tv = (TextView) tabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
                tv.setTextColor(Color.parseColor("#FFFFFF"));
            }
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
                ParseUser.getCurrentUser().logOut();
                //ParseUser currentUser = ParseUser.getCurrentUser();
                startActivity(new Intent(this,LoginActivity.class));
                return true;


            case R.id.twitter_feed:
                startActivity(new Intent(this, TwitterFeedActvity.class));
                return true;

            case R.id.at_register:
                startActivity(new Intent(this, NCATRegisterActivity.class));
                return true;

            default:
                return super.onContextItemSelected(item);

        }

    }

    }
 
