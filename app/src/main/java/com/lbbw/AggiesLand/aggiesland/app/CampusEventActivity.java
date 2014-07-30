package com.lbbw.AggiesLand.aggiesland.app;

import android.app.Activity;
import android.app.ListActivity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BTX17-1 on 7/22/2014.
 */
public class CampusEventActivity extends ListActivity {

    ListView campusEventView;
    List<ParseObject> object;
    ProgressDialog mProgressDialog;
    CampusEventViewAdapter campusadapter;
    private List<CampusEvents> campuseventslist = null;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.campuseventslist_main);
        new RemoteDataTask().execute();
    }

    private class RemoteDataTask extends AsyncTask<Void,Void,Void>{
        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            mProgressDialog = new ProgressDialog(CampusEventActivity.this);
            // Set progressdialog message
            mProgressDialog.setMessage("Loading...");
            mProgressDialog.setIndeterminate(false);
            // Show progressdialog
            mProgressDialog.show();
        }

        @Override
        protected Void doInBackground(Void... params){
            campuseventslist = new ArrayList<CampusEvents>();

            try{
                ParseQuery<ParseObject> clubQuery = new ParseQuery<ParseObject>("CampusEvents");
                clubQuery.orderByDescending("createdAt");
                object = clubQuery.find();
                for(ParseObject campusevents : object){

                    ParseFile image = (ParseFile) campusevents.get("imageFile");

                    CampusEvents campuseventsdata = new CampusEvents();
                    campuseventsdata.setDate((String) campusevents.get("Date"));
                    campuseventsdata.setEventName((String) campusevents.get("EventName"));
                    campuseventsdata.setLocation((String) campusevents.get("Location"));
                    campuseventsdata.setDetails((String) campusevents.get("AddInstructions"));
                    campuseventsdata.setImage(image.getUrl());

                    campuseventslist.add(campuseventsdata);

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
            ListAdapter campusadapter = new CampusEventViewAdapter(CampusEventActivity.this, campuseventslist);
            // Binds the Adapter to the ListView
            setListAdapter(campusadapter);
            // Close the progressdialog
            mProgressDialog.dismiss();
        }

    }




}
