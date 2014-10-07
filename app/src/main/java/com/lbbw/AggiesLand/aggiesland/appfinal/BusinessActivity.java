package com.lbbw.AggiesLand.aggiesland.appfinal;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by Neegbeah Reeves on 10/7/2014.
 */
public class BusinessActivity extends Activity {

    private WebView webView;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.businessview);

         webView = (WebView) findViewById(R.id.webview);
         webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.aggiesland.com/#!business/c21b7");
    }

}
