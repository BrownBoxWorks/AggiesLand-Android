package com.lbbw.AggiesLand.aggiesland.app;

import android.app.Activity;
import android.app.ListActivity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;


public class NewsActivity extends ListActivity {

    ListView listview;
    List<ParseObject> ob;
    ProgressDialog mProgressDialog;
    private List<News> newslist = null;
    NewsListViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Parse.initialize(this, "5b91v6F6A0GaeC64FuIgeCctYaEM81LFybSR4g7K", "wlp32pFFhzB2jz5dbHrTCHBPkqB7Y9AFxNTKrYl6");


        setContentView(R.layout.newslistview_main);
        new RemoteDataTask().execute();

    }

    // RemoteDataTask AsyncTask
    private class RemoteDataTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            // Create a progressdialog
            mProgressDialog = new ProgressDialog(NewsActivity.this);

            // Set progressdialog message
            mProgressDialog.setMessage("Loading...");
            mProgressDialog.setIndeterminate(false);
            // Show progressdialog
            mProgressDialog.show();

        }

        @Override
        protected Void doInBackground(Void... params) {
            // Create the array
            newslist = new ArrayList<News>();
            try {
                // Locate the class table named "Country" in Parse.com
                ParseQuery<ParseObject> query = new ParseQuery<ParseObject>(
                        "News");
                // Locate the column named "ranknum" in Parse.com and order list
                // by ascending
                query.orderByDescending("createdAt");
                ob = query.find();
                for (ParseObject objects : ob) {
                    // Locate images in flag column
                    ParseFile image = (ParseFile) objects.get("imageFile");

                    News data = new News();
                    data.setDate((String) objects.get("Date"));
                    data.setTitle((String) objects.get("Title"));
                    data.setBody((String) objects.get("Body"));
                    data.setImageFile(image.getUrl());
                    newslist.add(data);
                }
            } catch (ParseException e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return null;
        }


        @Override
        protected void onPostExecute(Void result) {
            // Locate the listview in listview_main.xml
          //  listview = (ListView) findViewById(R.id.list);
            // Pass the results into ListViewAdapter.java
            ListAdapter adapter = new NewsListViewAdapter(NewsActivity.this, newslist);
            // Binds the Adapter to the ListView
            setListAdapter(adapter);
            // Close the progressdialog
            mProgressDialog.dismiss();
        }
    }
}



/*
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();
            if (id == R.id.action_settings) {
                return true;
            }
            return super.onOptionsItemSelected(item);
        }

}
*/