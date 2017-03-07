package com.example.ayaan.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Locale;

public class waterfall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waterfall);

        final ArrayList<tour> items = new ArrayList<tour>();
        items.add(new tour(R.drawable.kemptyfall,getString(R.string.kemptyfalltitle),getString(R.string.kemptyfalldesc),30.4873202,78.0363141));
        items.add(new tour(R.drawable.bhattafalls1,getString(R.string.bhattafalltitle),getString(R.string.bhattafalldesc),30.438833,78.07442560000004));
        items.add(new tour(R.drawable.mossyfall,getString(R.string.mossyfalltitle),getString(R.string.mossyfalldesc),30.4396091,78.09277299999997));
        items.add(new tour(R.drawable.jharipanifalls,getString(R.string.jharipanifallstitle),getString(R.string.jharipanifallsdesc),30.4254949,78.08516069999996));
        tourAdapter adapter = new tourAdapter(this, items);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,View view,int position,long id) {
                String uri = String.format(Locale.ENGLISH, "geo:%f,%f",tour.getlatitude(), tour.getlongitude());
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });
    }
}
