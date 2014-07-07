package com.lbbw.AggiesLand.aggiesland.app;

import com.parse.ParseClassName;

/**
 * Created by BTX17-1 on 6/21/2014.
 */

public class Clubs {
    private String date;
    private String title;
    private String clubName;
    private String address;
    private String price;
    private String detail;
    private String image;

    public String getDate(){
        return date;
    }

    public void setDate(String date){
        this.date = date;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title =title;
    }

    public String getClubName(){
        return  clubName;
    }

    public void setClubName(String clubName){
        this.clubName = clubName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getImage(){
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}


