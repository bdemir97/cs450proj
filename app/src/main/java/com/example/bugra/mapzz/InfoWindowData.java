package com.example.bugra.mapzz;


import android.text.style.BackgroundColorSpan;
import android.widget.RatingBar;

public class InfoWindowData {
    private String image;
    private String Plant;
    private String HouseInfo;
    private String Success;
    private int Rating;
    public BackgroundColorSpan color;

    public BackgroundColorSpan getColor() {
        return color;
    }

    public void setColor(BackgroundColorSpan color) {
        this.color = color;
    }

    public int getRating(){
        return Rating;
    }

    public void setRating(int rating){
        this.Rating=rating;
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPlant() {
        return Plant;
    }

    public void setPlant(String Plant) {
        this.Plant = Plant;
    }

    public String getHouseInfo() {
        return HouseInfo;
    }

    public void setHouseInfo(String HouseInfo) {
        this.HouseInfo = HouseInfo;
    }

    public String getSuccess() {
        return Success;
    }

    public void setSuccess(String Success) {
        this.Success = Success;
    }
}