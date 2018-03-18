package com.example.android.coltscounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int coltsScore = 0;
    int opponentScore = 0;
    int coltsPenalties = 0;
    int opponentPenalties = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * display score for Colts
     */

    public void displayScoreForColts(int score) {
        TextView scoreView = (TextView) findViewById(R.id.coltsScore);
        scoreView.setText(String.valueOf(score));
    }

    public void displayScoreForOpponent(int score) {
        TextView scoreView = (TextView) findViewById(R.id.opponentScore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * display penalties for Colts
     */

    public void displayPenaltiesForColts(int penalties) {
        TextView penaltiesView = (TextView) findViewById(R.id.coltsPenalties);
        penaltiesView.setText(String.valueOf(penalties));
    }

    public void displayPenaltiesForOpponent(int penalties) {
        TextView penaltiesView = (TextView) findViewById(R.id.opponentPenalties);
        penaltiesView.setText(String.valueOf(penalties));
    }

    /**
     * method to add colts touchdown
     */
    public void addColtsTouchdown(View view) {
        coltsScore = coltsScore + 6;
        displayScoreForColts(coltsScore);
    }

    /**
     * method to add opponent touchdown
     */
    public void addOpponentTouchdown(View view) {
        opponentScore = opponentScore + 6;
        displayScoreForOpponent(opponentScore);
    }

    /**
     * method to addExtraPoint for Colts
     */
    public void addColtsExtraPoint(View view) {
        coltsScore = coltsScore + 1;
        displayScoreForColts(coltsScore);
    }

    /**
     * method to addExtraPoint for Opponent
     */
    public void addOpponentExtraPoint(View view) {
        opponentScore = opponentScore + 1;
        displayScoreForOpponent(opponentScore);
    }

    /**
     * method to addColtsFieldGoal for Colts
     */
    public void addColtsFieldGoal(View view) {
        coltsScore = coltsScore + 3;
        displayScoreForColts(coltsScore);
    }

    /**
     * method to addOpponentFieldGoal for Colts
     */
    public void addOpponentFieldGoal(View view) {
        opponentScore = opponentScore + 3;
        displayScoreForOpponent(opponentScore);
    }

    /**
     * method to remove colts point
     */
    public void removeColtsPoint(View view)
    {
        if(coltsScore > 0)
        {
            coltsScore = coltsScore - 1;
            displayScoreForColts(coltsScore);
        }
        else {
            displayScoreForColts(coltsScore);
        }

    }

    /**
     * method to remove opponent point
     */
    public void removeOpponentPoint(View view)
    {
        if(opponentScore > 0)
        {
            opponentScore = opponentScore - 1;
            displayScoreForOpponent(opponentScore);
        }
        else {
            displayScoreForOpponent(opponentScore);
        }

    }

    /**
     * method to add colts point
     */
    public void addColtsPoint(View view){
        coltsScore = coltsScore + 1;
        displayScoreForColts(coltsScore);
    }

    /**
     * method to add opponent point
     */
    public void addOpponentPoint(View view){
        opponentScore = opponentScore + 1;
        displayScoreForOpponent(opponentScore);
    }

    /**
     * method to add penalties for Colts
     */
    public void throwColtsFlag(View view)
    {
        coltsPenalties = coltsPenalties + 1;
        displayPenaltiesForColts(coltsPenalties);
    }

    /**
     * method to add penalties for Opponent
     */
    public void throwOpponentFlag(View view)
    {
        opponentPenalties = opponentPenalties + 1;
        displayPenaltiesForOpponent(opponentPenalties);
    }

    /**
     * method to remove penalties for Colts
     */
    public void removeColtsFlag(View view)
    {
        if(coltsPenalties > 0) {
            coltsPenalties = coltsPenalties - 1;
            displayPenaltiesForColts(coltsPenalties);
        }
        else {
            displayPenaltiesForColts(coltsPenalties);
        }
    }

    /**
     * method to remove penalties for Opponents
     */
    public void removeOpponentFlag(View view)
    {
        if(opponentPenalties > 0) {
            opponentPenalties = opponentPenalties - 1;
            displayPenaltiesForOpponent(opponentPenalties);
        }
        else {
            displayPenaltiesForOpponent(opponentPenalties);
        }
    }

    /**
     * reset score to 0
     */
    public void reset(View view) {
        coltsScore = 0;
        opponentScore = 0;
        coltsPenalties = 0;
        opponentPenalties = 0;
        displayScoreForColts(coltsScore);
        displayPenaltiesForColts(coltsPenalties);
        displayScoreForOpponent(opponentScore);
        displayPenaltiesForOpponent(opponentPenalties);

    }
}