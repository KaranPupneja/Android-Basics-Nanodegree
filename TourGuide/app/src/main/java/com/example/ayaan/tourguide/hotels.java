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

public class hotels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waterfall);

        final ArrayList<tour> items = new ArrayList<tour>();
        items.add(new tour(R.drawable.jwmarriott,getString(R.string.jwmarriotttitle),getString(R.string.jwmarriottdesc),30.4816525,78.04667040000004));
        items.add(new tour(R.drawable.jaypee,getString(R.string.jaypeetitle),getString(R.string.jaypeedesc),30.438816,78.08533899999998));
        items.add(new tour(R.drawable.fortunethesavoy,getString(R.string.fortunethesavoytitle),getString(R.string.fortunethesavoydesc),30.4602908,78.06263999999999));
        items.add(new tour(R.drawable.claridges,getString(R.string.claridgestitle),getString(R.string.claridgesdesc),30.44704109999999,78.08306419999997));
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
