package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeperapp.R;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int yellowTeamA = 0;
    int yellowTeamB = 0;
    int redTeamA = 0;
    int redTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void addGoalTeamA(View v){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    public void addYellowTeamA(View v){
        yellowTeamA = yellowTeamA + 1;
        displayYellowTeamA(yellowTeamA);
    }
    public void addRedTeamA(View v){
        redTeamA = redTeamA + 1;
        displayRedTeamA(redTeamA);
    }
    public void addGoalTeamB(View v){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    public void addYellowTeamB(View v){
        yellowTeamB = yellowTeamB + 1;
        displayYellowTeamB(yellowTeamB);
    }
    public void addRedTeamB(View v){
        redTeamB = redTeamB + 1;
        displayRedTeamB(redTeamB);
    }
    public void resetScores (View v){
        scoreTeamB = 0;
        scoreTeamA = 0;
        yellowTeamA = 0;
        yellowTeamB = 0;
        redTeamA = 0;
        redTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayYellowTeamA (yellowTeamA);
        displayRedTeamA(redTeamA);
        displayYellowTeamB(yellowTeamB);
        displayRedTeamB(redTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayYellowTeamA(int yellow) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow);
        scoreView.setText(String.valueOf(yellow));
    }
    public void displayRedTeamA(int red) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red);
        scoreView.setText(String.valueOf(red));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayYellowTeamB(int yellow) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow);
        scoreView.setText(String.valueOf(yellow));
    }
    public void displayRedTeamB(int red) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red);
        scoreView.setText(String.valueOf(red));
    }





}
