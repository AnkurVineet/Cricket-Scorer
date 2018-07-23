package com.example.dell.cricketscorer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int runTeamA = 0;
    int runTeamB = 0;
    int wicketTeamA = 0;
    int wicketTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int runs, int wickets) {
        TextView scoreView = findViewById(R.id.team_a_score);
        String score = runs + "/" + wickets;
        scoreView.setText(score);
    }

    public void oneRunForTeamA(View view) {
        runTeamA += 1;
        displayForTeamA(runTeamA, wicketTeamA);
    }

    public void fourRunForTeamA(View view) {
        runTeamA += 4;
        displayForTeamA(runTeamA, wicketTeamA);
    }

    public void sixRunForTeamA(View view) {
        runTeamA += 6;
        displayForTeamA(runTeamA, wicketTeamA);
    }

    public void wicketOfTeamA(View view) {
        wicketTeamA++;
        if (wicketTeamA == 10) {
            endInningsTeamA();
        } else
            displayForTeamA(runTeamA, wicketTeamA);
    }

    public void displayForTeamB(int runs, int wickets) {
        TextView scoreView = findViewById(R.id.team_b_score);
        String score = runs + "/" + wickets;
        scoreView.setText(score);
    }

    public void oneRunForTeamB(View view) {
        runTeamB += 1;
        displayForTeamB(runTeamB, wicketTeamB);
    }

    public void fourRunForTeamB(View view) {
        runTeamB += 4;
        displayForTeamB(runTeamB, wicketTeamB);
    }

    public void sixRunForTeamB(View view) {
        runTeamB += 6;
        displayForTeamB(runTeamB, wicketTeamB);
    }

    public void wicketOfTeamB(View view) {
        wicketTeamB++;
        if (wicketTeamB == 10) {
            endInningsTeamB();
        } else
            displayForTeamB(runTeamB, wicketTeamB);
    }

    public void endInningsTeamA() {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(runTeamA));
        Toast.makeText(this, "Team A All Out at " + runTeamA, Toast.LENGTH_LONG).show();
        runTeamA = 0;
        wicketTeamA = 0;
    }

    public void endInningsTeamB() {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(runTeamB));
        Toast.makeText(this, "Team B All Out at " + runTeamB, Toast.LENGTH_LONG).show();
        runTeamB = 0;
        wicketTeamB = 0;
    }

    public void resetScore(View view) {
        runTeamA = 0;
        runTeamB = 0;
        wicketTeamA = 0;
        wicketTeamB = 0;
        displayForTeamA(runTeamA, wicketTeamA);
        displayForTeamB(runTeamB, wicketTeamB);
    }
}
