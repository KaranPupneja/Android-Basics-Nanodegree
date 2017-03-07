package com.example.ayaan.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView waterfalltextview = (TextView)findViewById(R.id.waterfalls);
        waterfalltextview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent waterfalllistener = new Intent(MainActivity.this,waterfall.class);
                startActivity(waterfalllistener);
            }
        });
        final TextView hoteltextview = (TextView)findViewById(R.id.hotels);
        hoteltextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotellistener = new Intent(MainActivity.this,hotels.class);
                startActivity(hotellistener);
            }
        });
        TextView attractionstextview = (TextView)findViewById(R.id.attractions);
        attractionstextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent attractionlistener = new Intent(MainActivity.this,attractions.class);
                startActivity(attractionlistener);
            }
        });
        TextView restauranttextview = (TextView)findViewById(R.id.restaurants);
        restauranttextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurantlistener = new Intent(MainActivity.this,restaurants.class);
                startActivity(restaurantlistener);
            }
        });
    }

}
