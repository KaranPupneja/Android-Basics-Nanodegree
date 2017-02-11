package com.example.ayaan.musicxpress;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuOption extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_option);
        TextView player = (TextView)findViewById(R.id.main);
        player.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent playerinte = new Intent(MenuOption.this,MainActivity.class);
                startActivity(playerinte);
            }
        });
        TextView songs = (TextView)findViewById(R.id.songsall);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent allsongs = new Intent(MenuOption.this,AllSongs.class);
                startActivity(allsongs);
            }
        });
        TextView play = (TextView)findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlist = new Intent(MenuOption.this,Playlist.class);
                startActivity(playlist);
            }
        });
        TextView settings = (TextView)findViewById(R.id.set);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sett = new Intent(MenuOption.this,Setting.class);
                startActivity(sett);
            }
        });
    }

}

