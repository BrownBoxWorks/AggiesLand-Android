package com.lbbw.AggiesLand.aggiesland.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Quis on 7/22/2014.
 */
public class AthleteListViewAdapter extends BaseAdapter {



    
    Context context;
    String [] title;
    LayoutInflater inflater;
   

    public AthleteListViewAdapter(Context context, String [] title, LayoutInflater inflater) {
        this.context = context;
        this.title = title;


    }

    public AthleteListViewAdapter(AthleteListView athleteListView, String[] title) {
    }

    @Override
    public int getCount(){
            return title.length;
        }

        @Override
    public Object getItem(int position) {return  null;}
    
    public long getItemId(int position){
        return position;
    }


    public View getView (int position, View convertView, ViewGroup parent) {
        TextView sportName;

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.athletelistview_item, parent, false);
        sportName = (TextView) itemView.findViewById(R.id.title);
        sportName.setText(title[position]);
        return itemView;
    }
  

}

