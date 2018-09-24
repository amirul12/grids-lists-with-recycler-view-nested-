package com.edupointbd.amirul.recyclerviewnestet.services;

import com.edupointbd.amirul.recyclerviewnestet.model.Station;

import java.util.ArrayList;

public class DataServices {
    private static final DataServices ourInstance = new DataServices();

    public static DataServices getInstance() {
        return ourInstance;
    }

    private DataServices() {
    }

    public ArrayList<Station> getFeaturesStations(){
        //pretend we just downloaded features stations from the internet

        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Mornig show","amirul"));
        list.add(new Station("Mornig show","amirul"));
        list.add(new Station("Mornig show","amirul"));
        list.add(new Station("Mornig show","amirul"));
        list.add(new Station("Mornig show","amirul"));

        return list;
    }

    public ArrayList<Station> getRecentStations (){

        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Recent stations show","profile"));
        list.add(new Station("Recent stations show","profile"));
        list.add(new Station("Recent stations show","profile"));
        list.add(new Station("Recent stations show","profile"));
        list.add(new Station("Recent stations show","profile"));
        list.add(new Station("Recent stations show","profile"));
        list.add(new Station("Recent stations show","profile"));
        list.add(new Station("Recent stations show","profile"));
        list.add(new Station("Recent stations show","profile"));
        list.add(new Station("Recent stations show","profile"));
        list.add(new Station("Recent stations show","profile"));
        list.add(new Station("Recent stations show","profile"));
        list.add(new Station("Recent stations show","profile"));
        list.add(new Station("Recent stations show","profile"));
        list.add(new Station("Recent stations show","profile"));
        list.add(new Station("Recent stations show","profile"));
        list.add(new Station("Recent stations show","profile"));


        return list;
    }

    public ArrayList<Station> getPartyStation(){
        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Party  stations show","amirul"));
        list.add(new Station("Party  stations show","amirul"));
        list.add(new Station("Party  stations show","amirul"));
        list.add(new Station("Party  stations show","amirul"));

        return list;

    }
}
