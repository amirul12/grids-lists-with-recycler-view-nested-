package com.edupointbd.amirul.recyclerviewnestet.model;

public class Station {

    final String DRAWABLE = "drawable/";
    private String stationTitle;
    private String imaUrl;

    public Station(String stationTitle, String imaUrl) {
        this.stationTitle = stationTitle;
        this.imaUrl = imaUrl;
    }

    public String getStationTitle() {
        return stationTitle;
    }

    public String getImaUrl() {
        return imaUrl;
    }
}

