package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }
    int Score=0,Score2=0;
    public void add_3_on_Press(View v){
        displayForTeamA(Score=Score+3);
    }
    public void add_2_on_Press(View v){
        displayForTeamA(Score=Score+2);

    }
    public void add_FreeThrow_on_Press(View v){
        displayForTeamA(Score=Score+1);

    }
    public void add_3_on_PressB(View v){

        displayForTeamB(Score2=Score2+3);
    }
    public void add_2_on_PressB(View v){

        displayForTeamB(Score2=Score2+2);
    }
    public void add_FreeThrow_on_PressB(View v){

        displayForTeamB(Score2=Score2+1);
    }
    public void ResetButton(View v){
        displayForTeamA(Score=0);
        displayForTeamB(Score2=0);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score1) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score1));
    }
    public void displayForTeamB(int score2){
        TextView scoreView=(TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score2));

    }
}