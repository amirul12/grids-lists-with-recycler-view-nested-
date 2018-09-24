package com.edupointbd.amirul.recyclerviewnestet.holders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.edupointbd.amirul.recyclerviewnestet.R;
import com.edupointbd.amirul.recyclerviewnestet.model.Station;

public class StationViewHolder extends RecyclerView.ViewHolder {

    private ImageView mainImage;
    private TextView mainText;

    public StationViewHolder(@NonNull View itemView) {
        super(itemView);

        this.mainImage = (ImageView) itemView.findViewById(R.id.mainImage);
        this.mainText = (TextView)itemView.findViewById(R.id.mainText);

    }

    public void updateUI(Station station){
        String uri = station.getImaUri();
        int resource = mainImage.getResources().getIdentifier(uri,null, mainImage.getContext().getPackageName());
        mainImage.setImageResource(resource);
        mainText.setText(station.getStationTitle());

    }

}
