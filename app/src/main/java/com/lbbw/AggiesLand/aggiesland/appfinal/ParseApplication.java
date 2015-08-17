package com.lbbw.AggiesLand.aggiesland.appfinal;

/**
 * Created by BTX17-1 on 6/13/2014.
 */

import com.crashlytics.android.Crashlytics;
import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseInstallation;
import com.parse.ParseUser;
import com.parse.PushService;
import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;

import android.widget.Toast;



import android.app.Application;
import android.content.res.Configuration;

import io.fabric.sdk.android.Fabric;

public class ParseApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        // Twitter Fabric Kit
        TwitterAuthConfig authConfig =  new TwitterAuthConfig("kzH0xm2yqReZW5TjNNF63zpyK", "r0tBiDbskNbX6ytHMTCerPcExwHzMhaBxUJYli4ykSE1GhoA9B");
        Fabric.with(this, new Twitter(authConfig));

            // Add your initialization code here
            Parse.initialize(this, "5b91v6F6A0GaeC64FuIgeCctYaEM81LFybSR4g7K", "wlp32pFFhzB2jz5dbHrTCHBPkqB7Y9AFxNTKrYl6");
            PushService.setDefaultPushCallback(this, TabBarActivity.class);
            ParseInstallation.getCurrentInstallation().saveInBackground();

          //  ParseUser.enableAutomaticUser();
           // ParseACL defaultACL = new ParseACL();

        // If you would like all objects to be private by default, remove this line.
        //defaultACL.setPublicReadAccess(true);

       // ParseACL.setDefaultACL(defaultACL, true);




    }

    @Override
    public void onConfigurationChanged(Configuration newConfig)
    {
        super.onConfigurationChanged(newConfig);
    }


    @Override
    public void onLowMemory()
    {
        // TODO Auto-generated method stub
        super.onLowMemory();
    }

    @Override
    public void onTerminate()
    {
        // TODO Auto-generated method stub
        super.onTerminate();
    }


}
