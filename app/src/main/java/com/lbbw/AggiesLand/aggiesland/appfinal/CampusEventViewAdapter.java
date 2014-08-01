package com.lbbw.AggiesLand.aggiesland.appfinal;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BTX17-1 on 7/22/2014.
 */
public class CampusEventViewAdapter extends BaseAdapter {

    Context campuscontext;
    LayoutInflater campusinflater;
    ImageLoader campusImageLoader;
    private List<CampusEvents> campusList = null;
    private ArrayList<CampusEvents> campusarraylist;

    public CampusEventViewAdapter (Context context, List<CampusEvents> campusList){
        this.campuscontext = context;
        this.campusList = campusList;
        campusinflater = LayoutInflater.from(context);
        this.campusarraylist = new ArrayList<CampusEvents>();
        this.campusarraylist.addAll(campusList);
        campusImageLoader = new ImageLoader(context);


    }

    public class ViewHolder {
        TextView dateLabel;
        TextView eventNameLabel;
        TextView locationLabel;
        TextView detailLabel;
        ImageView campusImage;


    }

    @Override
    public int getCount(){
        return campusList.size();
    }

    @Override
    public Object getItem(int position){
        return campusList.get(position);

    }

    @Override
    public long getItemId(int position){
        return position;
    }

    public View getView(final int position, View view, ViewGroup parent){
        final ViewHolder campusHolder;
        if(view == null){
            campusHolder = new ViewHolder();
            view = campusinflater.inflate(R.layout.campuseventslist_item,null);
            campusHolder.dateLabel = (TextView) view.findViewById(R.id.date);
            campusHolder.eventNameLabel = (TextView) view.findViewById(R.id.eventName);
            campusHolder.campusImage = (ImageView) view.findViewById(R.id.image);

            view.setTag(campusHolder);

        }

        else{
            campusHolder = (ViewHolder)view.getTag();
        }

        campusHolder.dateLabel.setText(campusList.get(position).getDate());
        campusHolder.eventNameLabel.setText(campusList.get(position).getEventName());

       campusImageLoader.DisplayImage(campusList.get(position).getImage(), campusHolder.campusImage);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(campuscontext, CampusEventsSingleItemView.class);

                intent.putExtra("Date", campusList.get(position).getDate());
                intent.putExtra("EventName", campusList.get(position).getEventName());
                intent.putExtra("Location", campusList.get(position).getLocation());
                intent.putExtra("Details", campusList.get(position).getDetails());
                intent.putExtra("imageFile", campusList.get(position).getImage());

                campuscontext.startActivity(intent);
            }
        });
        return view;

    }

}
