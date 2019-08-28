package com.example.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MadLibDisplay extends AppCompatActivity {
    public static final String MY_GIRL = "girl";
    public static final String MY_ENEMY = "enemy";
    public static final String MY_FOOD = "food";
    public static final String MY_ANIMAL = "animal";
    public static final String MY_YEAR = "year";
    public static final String MY_QUOTE = "enemy";

    @Override
    protected void onCreate(Bundle savedInstanceState) {super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_lib_display);
        Intent intent = getIntent();
        String girl = intent.getStringExtra(MY_GIRL);
        String enemy = intent.getStringExtra(MY_ENEMY);
        String food = intent.getStringExtra(MY_FOOD);
        String animal = intent.getStringExtra(MY_ANIMAL);
        String year = intent.getStringExtra(MY_YEAR);
        String quote = intent.getStringExtra(MY_QUOTE);
        String strToDisplay = "Once upon a time, there was a " +
                animal + " named " + girl + ". One day, " + girl + " went to" +
                " Target to buy some " + food + " for her birthday party. At " +
                "Target, " + girl + " saw her worst enemy : " + enemy + "the giraffe. Why " +
                "were they enemies, you may ask.";
        TextView str = (TextView) findViewById(R.id.info);
        str.setText(strToDisplay);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
