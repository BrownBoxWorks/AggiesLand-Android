package com.lbbw.AggiesLand.aggiesland.app;

/**
 * Created by BTX17-1 on 6/13/2014.
 */

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;
import com.parse.PushService;

import android.app.Application;

public class ParseApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        // Add your initialization code here
        Parse.initialize(this, "5b91v6F6A0GaeC64FuIgeCctYaEM81LFybSR4g7K", "wlp32pFFhzB2jz5dbHrTCHBPkqB7Y9AFxNTKrYl6");
        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();

        // If you would like all objects to be private by default, remove this line.
        defaultACL.setPublicReadAccess(true);

        ParseACL.setDefaultACL(defaultACL, true);
        PushService.setDefaultPushCallback(this, TabBarActivity.class);
    }
}
