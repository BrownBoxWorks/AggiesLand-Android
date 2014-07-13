package com.lbbw.AggiesLand.aggiesland.app;

/**
 * Created by BTX17-1 on 6/21/2014.
 */

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.app.ListActivity;
import android.app.ProgressDialog;
import android.drm.ProcessedData;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseQuery;

public class ClubActivity extends ListActivity {

    ListView clublistview;
    List<ParseObject> object;
    ProgressDialog mProgressDialog;
    ClubListViewAdapter clubadapter;
    private List<Clubs> clublist = null;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  Parse.initialize(this, "5b91v6F6A0GaeC64FuIgeCctYaEM81LFybSR4g7K", "wlp32pFFhzB2jz5dbHrTCHBPkqB7Y9AFxNTKrYl6");


        setContentView(R.layout.clublistview_main);
        new RemoteDataTask().execute();
    }


    private class RemoteDataTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            mProgressDialog = new ProgressDialog(ClubActivity.this);
            // Set progressdialog message
            mProgressDialog.setMessage("Loading...");
            mProgressDialog.setIndeterminate(false);
            // Show progressdialog
            mProgressDialog.show();
        }

        @Override
        protected  Void doInBackground(Void... params){
            clublist = new ArrayList<Clubs>();

            try{
                ParseQuery<ParseObject> clubQuery = new ParseQuery<ParseObject>("Clubs");
                clubQuery.orderByDescending("createdAt");
                object = clubQuery.find();
                for (ParseObject clubs : object){

                    ParseFile image = (ParseFile) clubs.get("imageFile");

                    Clubs clubdata = new Clubs();
                    clubdata.setDate((String) clubs.get("Date"));
                    clubdata.setTitle((String) clubs.get("Title"));
                    clubdata.setClubName((String) clubs.get("ClubName"));
                    clubdata.setAddress((String) clubs.get("Address"));
                    clubdata.setPrice((String) clubs.get("Price"));
                    clubdata.setDetail((String) clubs.get("Details"));
                    clubdata.setImage(image.getUrl());

                    clublist.add(clubdata);

                }

                }
            catch (ParseException e){
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result){

            //  listview = (ListView) findViewById(R.id.list);
            // Pass the results into ListViewAdapter.java
            ListAdapter clubadapter = new ClubListViewAdapter(ClubActivity.this, clublist);
            // Binds the Adapter to the ListView
            setListAdapter(clubadapter);
            // Close the progressdialog
            mProgressDialog.dismiss();
        }


    }
}
