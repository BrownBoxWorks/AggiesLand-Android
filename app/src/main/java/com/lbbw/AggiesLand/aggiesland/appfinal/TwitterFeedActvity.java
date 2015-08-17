package com.lbbw.AggiesLand.aggiesland.appfinal;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;

import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.Result;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.models.Tweet;
import com.twitter.sdk.android.tweetui.SearchTimeline;
import com.twitter.sdk.android.tweetui.TimelineResult;
import com.twitter.sdk.android.tweetui.TweetTimelineListAdapter;
import com.twitter.sdk.android.tweetui.UserTimeline;

/**
 * Created by Neegbeah Reeves on 7/23/2015.
 */
public class TwitterFeedActvity extends ListActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twitterfeed);

        final SearchTimeline searchTimeline = new SearchTimeline.Builder()
                .query("#NCAT")
                .build();
        final TweetTimelineListAdapter adapter = new TweetTimelineListAdapter(this,
                searchTimeline);
        setListAdapter(adapter);


    }

}
