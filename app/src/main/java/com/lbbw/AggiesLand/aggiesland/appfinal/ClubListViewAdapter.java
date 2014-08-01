package com.lbbw.AggiesLand.aggiesland.appfinal;

import java.util.List;
import java.util.ArrayList;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by BTX17-1 on 6/21/2014.
 */
public class  ClubListViewAdapter extends BaseAdapter {
    Context clubcontext;
    LayoutInflater clubinflater;
    ImageLoader clubimageLoader;
    private List<Clubs> clubsList = null;
    private ArrayList<Clubs> clubarraylist;

    public ClubListViewAdapter (Context context, List<Clubs> clubsList){
        this.clubcontext = context;
        this.clubsList = clubsList;
        clubinflater = LayoutInflater.from(context);
        this.clubarraylist = new ArrayList<Clubs>();
        this.clubarraylist.addAll(clubsList);
        clubimageLoader = new ImageLoader(context);

    }

    // This is a test from Github - This is my change

    public class ViewHolder {
        TextView dateLabel;
        TextView titleLabel;
        TextView clubNameLabel;
        TextView addressLabel;
        TextView priceLabel;
        TextView detailLabel;
        ImageView clubimage;
    }

    @Override
    public int getCount(){
        return  clubsList.size();
    }

    @Override
    public Object getItem(int position){
        return clubsList.get(position);
    }


    @Override
    public long getItemId(int position){
        return position;
    }

    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder clubholder;
        if (view == null) {
            clubholder = new ViewHolder();
            view = clubinflater.inflate(R.layout.clublistview_item, null);
            clubholder.dateLabel = (TextView) view.findViewById(R.id.clubdate);
            clubholder.titleLabel = (TextView) view.findViewById(R.id.clubtitle);
            clubholder.clubNameLabel = (TextView) view.findViewById(R.id.clubname);
            //  holder.addressLabel = (TextView) view.findViewById(R.id.address);
            clubholder.priceLabel = (TextView) view.findViewById(R.id.clubprice);
            //  holder.detailLabel = (TextView) view.findViewById(R.id.detail);
            clubholder.clubimage = (ImageView) view.findViewById(R.id.clubimage);
                view.setTag(clubholder);

        } else {
            clubholder = (ViewHolder) view.getTag();

        }


        clubholder.dateLabel.setText(clubsList.get(position).getDate());
        clubholder.titleLabel.setText(clubsList.get(position).getTitle());
        clubholder.clubNameLabel.setText(clubsList.get(position).getClubName());
        //clubholder.addressLabel.setText(clubsList.get(position).getAddress());
        clubholder.priceLabel.setText(clubsList.get(position).getPrice());
        //clubholder.detailLabel.setText(clubsList.get(position).getDetail());

        clubimageLoader.DisplayImage(clubsList.get(position).getImage(), clubholder.clubimage);

        view.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(clubcontext, ClubSingleItemView.class);

                intent.putExtra("Date", clubsList.get(position).getDate());
                intent.putExtra("Title", clubsList.get(position).getTitle());
                intent.putExtra("ClubName", clubsList.get(position).getClubName());
                intent.putExtra("Address", clubsList.get(position).getAddress());
                intent.putExtra("Price", clubsList.get(position).getPrice());
                intent.putExtra("Details", clubsList.get(position).getDetail());
                intent.putExtra("imageFile", clubsList.get(position).getImage());

                clubcontext.startActivity(intent);
            }
        });
        return view;
    }


}
