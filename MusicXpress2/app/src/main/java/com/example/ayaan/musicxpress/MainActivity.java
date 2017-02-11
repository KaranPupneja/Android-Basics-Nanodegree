package com.example.ayaan.musicxpress;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView play_list = (ImageView)findViewById(R.id.playlistbutton);
        play_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersintent = new Intent(MainActivity.this,Playlist.class);
                startActivity(numbersintent);
            }
        });
        ImageView option = (ImageView)findViewById(R.id.menu);
        option.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainmenu = new Intent(MainActivity.this,MenuOption.class);
                startActivity(mainmenu);
            }
        });
        final ImageView b = (ImageView) findViewById(R.id.pause1);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                b.setImageResource(R.drawable.ic_play_circle_outline_black_24dp);
            }
        });
        ImageView all = (ImageView)findViewById(R.id.allsong);
        all.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent allson = new Intent(MainActivity.this,AllSongs.class);
                startActivity(allson);
            }
        });
        ImageView sett = (ImageView)findViewById(R.id.setting);
        sett.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent settings = new Intent(MainActivity.this,Setting.class);
                startActivity(settings);
            }
        });
    }
}
