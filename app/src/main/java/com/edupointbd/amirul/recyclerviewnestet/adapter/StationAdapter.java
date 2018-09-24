package com.edupointbd.amirul.recyclerviewnestet.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.edupointbd.amirul.recyclerviewnestet.R;
import com.edupointbd.amirul.recyclerviewnestet.activities.MainActivity;
import com.edupointbd.amirul.recyclerviewnestet.holders.StationViewHolder;
import com.edupointbd.amirul.recyclerviewnestet.model.Station;

import java.util.ArrayList;

public class StationAdapter extends RecyclerView.Adapter<StationViewHolder> {


    private ArrayList<Station> stations;

    public StationAdapter(ArrayList<Station> stations) {
        this.stations = stations;
    }


    @Override
    public void onBindViewHolder(@NonNull StationViewHolder holder, int position) {

        final Station station = stations.get(position);

        holder.updateUI(station);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //load Details screen
                MainActivity.getMainActivity().loadDetailsScreen(station);
            }
        });

    }

    @Override
    public int getItemCount() {
        return stations.size();
    }



    @NonNull
    @Override
    public StationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View cardStation = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_station,parent,false);
        return new StationViewHolder(cardStation);
    }


}
