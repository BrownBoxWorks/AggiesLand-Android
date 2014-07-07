package com.lbbw.AggiesLand.aggiesland.app;

/**
 * Created by BTX17-1 on 6/13/2014.
 */


import com.parse.Parse;
import com.parse.ParseClassName;
import com.parse.ParseObject;


public class News {

    private String date;
    private String title;
    private String body;
    private String imageFile;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getImageFile() {
        return imageFile;
    }

    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }

}


