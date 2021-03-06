package com.example.ryan.db;

import org.litepal.crud.DataSupport;

public class Landmark extends DataSupport {
    private int id;
    private String landmarkName;
    private int cityId;
    private int imageId;
    public Landmark(){
    };
    public Landmark(String landmarkName, int imageId){
        this.landmarkName = landmarkName;
        this.imageId = imageId;
    }
    public int getImageId(){
        return imageId;
    }
    public void setImageId(int imageId){
        this.imageId = imageId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getLandmarkName() {
        return landmarkName;
    }

    public void setLandmarkName(String landmarkName) {
        this.landmarkName = landmarkName;
    }
}
