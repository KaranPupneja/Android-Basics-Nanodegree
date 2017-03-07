package com.example.ayaan.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

public class attractions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waterfall);
        final ArrayList<tour> items = new ArrayList<tour>();
        items.add(new tour(R.drawable.georgeeverest,getString(R.string.georgeeveresttitle),getString(R.string.georgeeverestdesc),30.4586623,78.02299259999995));
        items.add(new tour(R.drawable.companygarden,getString(R.string.companybaghtitle),getString(R.string.companybaghdesc),30.4610517,78.05155209999998));
        items.add(new tour(R.drawable.laltibba,getString(R.string.laltibbatitle),getString(R.string.laltibbadesc),30.4669113,78.09502599999996));
        items.add(new tour(R.drawable.buddhatemple,getString(R.string.buddhatempletitle),getString(R.string.buddhatempledesc),30.4719579,78.04980130000001));
        items.add(new tour(R.drawable.camelsback,getString(R.string.camelsbacktitle),getString(R.string.camelsbackdesc),30.4606876,78.075918));
        tourAdapter attract = new tourAdapter(this,items);
        ListView listview = (ListView)findViewById(R.id.list);
        listview.setAdapter(attract);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String uri = String.format(Locale.ENGLISH, "geo:%f,%f",tour.getlatitude(), tour.getlongitude());
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });
    }
}
