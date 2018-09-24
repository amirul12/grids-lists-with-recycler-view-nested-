package com.edupointbd.amirul.recyclerviewnestet.activities;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.edupointbd.amirul.recyclerviewnestet.R;
import com.edupointbd.amirul.recyclerviewnestet.fragments.DetailsFragment;
import com.edupointbd.amirul.recyclerviewnestet.fragments.MainFragment;
import com.edupointbd.amirul.recyclerviewnestet.model.Station;

public class MainActivity extends AppCompatActivity {

    public static MainActivity getMainActivity() {
        return mainActivity;
    }

    private static void setMainActivity(MainActivity mainActivity) {
        MainActivity.mainActivity = mainActivity;
    }

    private static MainActivity mainActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setMainActivity(this);

        FragmentManager fm = getSupportFragmentManager();
        MainFragment mainFragment = (MainFragment)fm.findFragmentById(R.id.container_main);

        if(mainFragment == null){
            mainFragment = MainFragment.newInstance("first","last");
            fm.beginTransaction().add(R.id.container_main, mainFragment).commit();
        }

    }

    public void loadDetailsScreen(Station station){
        getSupportFragmentManager().beginTransaction().replace(R.id.container_main,new DetailsFragment()).addToBackStack(null).commit();

    }
}
