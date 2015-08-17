package com.lbbw.AggiesLand.aggiesland.appfinal;

import android.app.Activity;
import android.app.Notification;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by Neegbeah Reeves on 7/23/2015.
 */
public class NCATRegisterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ncatregister);

        WebView webView = (WebView) findViewById(R.id.webview);
        webView.loadUrl("http://www.ncatregister.com");
    }
}
