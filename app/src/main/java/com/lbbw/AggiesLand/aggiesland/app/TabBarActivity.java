package com.lbbw.AggiesLand.aggiesland.app;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

import com.parse.ParseAnalytics;
import com.parse.PushService;

/**
 * Created by BTX17-1 on 6/27/2014.
 */
@SuppressWarnings({"decrpriations"})
public class TabBarActivity extends TabActivity{

    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);


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

        tabHost.setCurrentTab(0);

        PushService.setDefaultPushCallback(this, TabBarActivity.class);
        ParseAnalytics.trackAppOpened(getIntent());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main,menu);
        return true;
    }

}
