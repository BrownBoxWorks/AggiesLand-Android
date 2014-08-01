package com.lbbw.AggiesLand.aggiesland.appfinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;


/**
 * Created by Quis on 7/31/2014.
 */
public class BusRoutesAdapter extends BaseAdapter {
    Context context;
    String [] title;
    LayoutInflater inflater;
    ListView listContent;


    public BusRoutesAdapter (Context context, String [] title){
        this.context = context;
        this.title = title;

    }
    @Override
    public int getCount(){return title.length; }

    @Override
    public Object getItem(int position){return null;}

    public long getItemId(int position){return 0;}


    public View getView(int position, View convertView, ViewGroup parent){
        TextView busRoute;

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.busroutesview_item,parent,false);
        busRoute = (TextView) itemView.findViewById(R.id.busRoute);
        busRoute.setText(title[position]);
        return itemView;




    }


}
