package com.lbbw.AggiesLand.aggiesland.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Quis on 7/22/2014.
 */
public class AthleteListViewAdapter extends BaseAdapter {

    Context context;
    String [] title;
    LayoutInflater inflater;
    ListView listContent;
   

    public AthleteListViewAdapter(Context context, String [] title) {
        this.context = context;
        this.title = title;


    }


    @Override
    public int getCount(){
            return title.length;
        }

        @Override
    public Object getItem(int position) {return  null;}
    
    public long getItemId(int position){
        return 0;
    }


    public View getView (int position, View convertView, ViewGroup parent) {
        TextView sportName;

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.athletelistview_item, parent, false);
        sportName = (TextView) itemView.findViewById(R.id.sportName);
        sportName.setText(title[position]);
        return itemView;

    }

}

