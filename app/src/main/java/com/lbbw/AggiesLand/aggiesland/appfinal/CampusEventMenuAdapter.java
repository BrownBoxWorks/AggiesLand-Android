package com.lbbw.AggiesLand.aggiesland.appfinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by BTX17-1 on 7/15/2014.
 */
public class CampusEventMenuAdapter extends BaseAdapter {

    Context context;
    String [] title;
    int [] picture;
    LayoutInflater inflater;

    public CampusEventMenuAdapter (Context context, String[]title, int []picture){
        this.context = context;
        this.title = title;
        this.picture = picture;

    }

    @Override
    public int getCount(){
        return title.length;

    }

    @Override
    public Object getItem(int position){
        return null;
    }

    @Override
    public long getItemId(int position){
        return 0;
    }

    public View getView (int position,View convertView, ViewGroup parent){
        TextView txttitle;
        ImageView img;

         inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.campuseventsoptionslist_item,parent,false);

        txttitle = (TextView)itemView.findViewById(R.id.title);
        img = (ImageView)itemView.findViewById(R.id.image);

        txttitle.setText(title[position]);
        img.setImageResource(picture[position]);

        return itemView;


    }


}
