package com.edupointbd.amirul.recyclerviewnestet.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.edupointbd.amirul.recyclerviewnestet.holders.StationViewHolder;
import com.edupointbd.amirul.recyclerviewnestet.model.Station;

import java.util.ArrayList;

public class StationAdapter extends RecyclerView.Adapter<StationViewHolder> {


    private ArrayList<Station> stations;

    public StationAdapter(ArrayList<Station> stations) {
        this.stations = stations;
    }

    @NonNull
    @Override
    public StationViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull StationViewHolder stationViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
