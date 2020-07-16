package com.example.gpstrackingdemo;

import android.app.Application;
import android.location.Location;

import java.util.ArrayList;
import java.util.List;

public class MyApplication extends Application {

    private List <Location>myLocations;

    public List<Location> getMyLocations() {
        return myLocations;
    }

    public void setMyLocations(List<Location> myLocations) {
        this.myLocations = myLocations;
    }

    private static MyApplication singleton;

    public MyApplication getInstance (){
        return singleton;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        singleton=this;
        myLocations=new ArrayList<>();

    }
}
