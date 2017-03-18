package com.hmmwow.www.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        int scoreTeamA = 0 , scoreTeamB = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //DISPLAY TEXTVIEW FOR SCORE FUNCTION "A"
    public void scoreForTeamA(int score){
        TextView textViewscore = (TextView) findViewById(R.id.team_a_score);
        textViewscore.setText(String.valueOf(score));
    }

    // DISPLAY PLUS THREE (+3) TO TEAM A
    public void plusThreeForTeamA(View view){
        scoreTeamA += 3;
        scoreForTeamA(scoreTeamA);
    }

    // DISPLAY PLUS TWO (+2) TO TEAM A
    public void plusTwoForTeamA(View view){
        scoreTeamA += 2;
        scoreForTeamA(scoreTeamA);
    }

    // DISPLAY PLUS ONE (+1) TO TEAM A
    public void plusOneForTeamA(View view){
        scoreTeamA += 1;
        scoreForTeamA(scoreTeamA);
    }

    /////////////////////////////////////////////////////////////////////////////////////////////
    //DISPLAY TEXTVIEW FOR SCORE FUNCTION B
    public void scoreForTeamB(int score){
        TextView textViewscore = (TextView) findViewById(R.id.team_b_score);
        textViewscore.setText(String.valueOf(score));
    }

    // DISPLAY PLUS THREE (+3) TO TEAM B
    public void plusThreeForTeamB(View view){
        scoreTeamB += 3;
        scoreForTeamB(scoreTeamB);
    }

    // DISPLAY PLUS TWO (+2) TO TEAM B
    public void plusTwoForTeamB(View view){
        scoreTeamB += 2;
        scoreForTeamB(scoreTeamB);
    }

    // DISPLAY PLUS ONE (+1) TO TEAM B
    public void plusOneForTeamB(View view){
        scoreTeamB += 1;
        scoreForTeamB(scoreTeamB);
    }

    public void resetGame(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        scoreForTeamA(scoreTeamA);
        scoreForTeamB(scoreTeamB);
    }
}
