package com.example.myapplication_final_;

import android.graphics.Movie;

import java.util.ArrayList;

public class MovieListResult {

    String boxofficeType;
    String showRange;

    private ArrayList<Movie> dailyBoxOfficeList=new ArrayList<Movie>();

    public ArrayList<Movie> getDailyBoxOfficeList() {
        return dailyBoxOfficeList;
    }

    public void setDailyBoxOfficeList(ArrayList<Movie> dailyBoxOfficeList) {
        this.dailyBoxOfficeList = dailyBoxOfficeList;
    }
}

