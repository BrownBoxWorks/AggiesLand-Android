package com.lbbw.AggiesLand.aggiesland.app;


import java.util.ArrayList;
import java.util.List;
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
 * Created by BTX17-1 on 6/13/2014.
 */
public class NewsListViewAdapter extends BaseAdapter {

    Context context;
    LayoutInflater inflater;
    ImageLoader imageLoader;
    private List<News> newslist = null;
    private ArrayList<News> arraylist;

    public NewsListViewAdapter(Context context,
                           List<News> newslist) {
        this.context = context;
        this.newslist = newslist;
        inflater = LayoutInflater.from(context);
        this.arraylist = new ArrayList<News>();
        this.arraylist.addAll(newslist);
        imageLoader = new ImageLoader(context);
    }

    public class ViewHolder {
        TextView date;
        TextView title;
        TextView body;
        ImageView image;
    }

    @Override
    public int getCount() {
        return newslist.size();
    }

    @Override
    public Object getItem(int position) {
        return newslist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.newslistview_item, null);
            // Locate the TextViews in listview_item.xml
            holder.title = (TextView) view.findViewById(R.id.title);
          // holder.body = (TextView) view.findViewById(R.id.body);
            holder.date = (TextView) view.findViewById(R.id.date);

            // Locate the ImageView in listview_item.xml
            holder.image = (ImageView) view.findViewById(R.id.image);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        // Set the results into TextViews
        holder.date.setText(newslist.get(position).getDate());
        holder.title.setText(newslist.get(position).getTitle());
       // holder.body.setText(newslist.get(position)
         //       .getBody());
        // Set the results into ImageView
        imageLoader.DisplayImage(newslist.get(position).getImageFile(),
                holder.image);
        // Listen for ListView Item Click
        view.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // Send single item click data to SingleItemView Class
                Intent intent = new Intent(context, NewsSingleItemView.class);
                // Pass all data rank
                intent.putExtra("Date",
                        (newslist.get(position).getDate()));
                // Pass all data country
                intent.putExtra("Title",
                        (newslist.get(position).getTitle()));
                // Pass all data population
                intent.putExtra("Body",
                        (newslist.get(position).getBody()));
                // Pass all data flag
                intent.putExtra("imageFile",
                        (newslist.get(position).getImageFile()));
                // Start SingleItemView Class
                context.startActivity(intent);
            }
        });
        return view;
    }


}
