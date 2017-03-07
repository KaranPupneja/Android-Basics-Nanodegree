package com.example.ayaan.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Locale;

public class restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waterfall);
        ArrayList<tour> items= new ArrayList<tour>();
        items.add(new tour(R.drawable.tavern,getString(R.string.taverntitle),getString(R.string.taverndesc),30.455175,78.08115799999996));
        items.add(new tour(R.drawable.kalsang,getString(R.string.kalsangtitle),getString(R.string.kalsangdesc),30.456138,78.07760269999994));
        items.add(new tour(R.drawable.littlellamacafe,getString(R.string.littlelamacafetitle),getString(R.string.littlelamacafedesc),30.4552328,78.08258320000004));
        items.add(new tour(R.drawable.lovelyomelette,getString(R.string.lovelyomelettetitle),getString(R.string.lovelyomelettedesc),30.4554161,78.07975349999992));
        ListView listview = (ListView)findViewById(R.id.list);
        listview.setAdapter(new tourAdapter(this,items));
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
