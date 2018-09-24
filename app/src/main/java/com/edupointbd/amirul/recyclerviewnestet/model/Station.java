package com.edupointbd.amirul.recyclerviewnestet.model;

public class Station {

    final String DRAWABLE = "drawable/";
    private String stationTitle;
    private String imaUri;

    public Station(String stationTitle, String imaUri) {
        this.stationTitle = stationTitle;
        this.imaUri = imaUri;
    }

    public String getStationTitle() {
        return stationTitle;
    }

    public String getImaUri() {
        return DRAWABLE + imaUri;
    }
}

