package com.edupointbd.amirul.recyclerviewnestet.fragments;


import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.edupointbd.amirul.recyclerviewnestet.R;
import com.edupointbd.amirul.recyclerviewnestet.adapter.StationAdapter;
import com.edupointbd.amirul.recyclerviewnestet.services.DataServices;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StationFragment extends Fragment {


    private static final String ARG_STATION_TYPE = "station_type";




    public static final int STATION_TYPE_FEATURE = 0;
    public static final int STATION_TYPE_RECENT = 1;
    public static final int STATION_TYPE_PARTY = 2;

    private int station_type;

    public StationFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param station_type Parameter 1.

     * @return A new instance of fragment StationFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static StationFragment newInstance(int station_type) {
        StationFragment fragment = new StationFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_STATION_TYPE, station_type);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

            station_type = getArguments().getInt(ARG_STATION_TYPE);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_station, container, false);

        RecyclerView recyclerView = (RecyclerView)v.findViewById(R.id.content_recycler);
        recyclerView.setHasFixedSize(true);

        recyclerView.addItemDecoration( new HorizontalSpaceItemDecoder(30));

        StationAdapter adapter ;
        if(station_type == STATION_TYPE_FEATURE){
            adapter = new StationAdapter(DataServices.getInstance().getFeaturesStations());

        }else if (station_type == STATION_TYPE_RECENT){

            adapter = new StationAdapter(DataServices.getInstance().getRecentStations());
        }else {

            adapter = new StationAdapter(DataServices.getInstance().getPartyStation());
        }


        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        // Inflate the layout for this fragment
        return v;


    }

}

class HorizontalSpaceItemDecoder extends RecyclerView.ItemDecoration{

    private final int space;

    public HorizontalSpaceItemDecoder(int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.right = space;
    }
}
