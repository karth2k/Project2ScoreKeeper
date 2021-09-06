package com.example.project2_scorekeeper;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * This app displays a Table Tennis game score.
 */
public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private int secondcount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * When the button is clicked this increases/decreases the score.
     */
    public void increaseone(View view) {
        display(count = count + 1);
    }

    public void increasetwo(View view) {
        displaytwo(secondcount = secondcount + 1);
    }

    public void decreaseone(View view) {
        display(count = count - 1);
    }

    public void decreasetwo(View view) {
        displaytwo(secondcount = secondcount - 1);
    }

    public void finalscore(View view) {
        displayfinal(count, secondcount);
    }


    /**
     * Shows the score on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_1_score);
        quantityTextView.setText("" + number);
    }

    private void displaytwo(int numbertwo) {
        TextView quantitytwoTextView = (TextView) findViewById(R.id.team_2_score);
        quantitytwoTextView.setText("" + numbertwo);
    }

    private void displayfinal(int scoreone, int scoretwo) {
        TextView quantitythreeTextView = (TextView) findViewById(R.id.final_score);
        quantitythreeTextView.setText("The game finished with Team 1 scoring " + count + " points and Team 2 scoring " + secondcount + " points. Good game!");
    }
}