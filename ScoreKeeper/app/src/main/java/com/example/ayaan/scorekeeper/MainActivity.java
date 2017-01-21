package com.example.ayaan.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //public void increase3()
    public void increase3(View v ){
       scoreA=scoreA+3;
        displayForTeamA(scoreA);
    }
    public void increase2(View v){
        scoreA=scoreA+2;
        displayForTeamA(scoreA);
    }
    public void increase1(View v){
        scoreA=scoreA +1;
        displayForTeamA(scoreA);
    }
    public void increase3b(View v ){
        scoreB=scoreB+3;
        displayForTeamB(scoreB);
    }
    public void increase2b(View v){
        scoreB=scoreB+2;
        displayForTeamB(scoreB);
    }
    public void increase1b(View v){
        scoreB=scoreB +1;
        displayForTeamB(scoreB);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
