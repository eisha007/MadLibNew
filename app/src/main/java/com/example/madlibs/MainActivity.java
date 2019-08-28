package com.example.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendInfo(View v) {

        // getting a reference to my edit text fields
        EditText girl = (EditText) findViewById(R.id.girlOne);
        EditText enemy = (EditText) findViewById(R.id.girlTwo);
        EditText food = (EditText) findViewById(R.id.food);
        EditText animal = (EditText) findViewById(R.id.animalOne);
        EditText year = (EditText) findViewById(R.id.year);
        EditText quote = (EditText) findViewById(R.id.quote);
        // extracting the text from those edit text fields
        String myGirl = girl.getText().toString();
        String myEnemy = enemy.getText().toString();
        String myFood = food.getText().toString();
        String myAnimal = animal.getText().toString();
        String myYear = year.getText().toString();
        String myQuote = quote.getText().toString();
        // Creating the intent object so I can send data
        Intent intent = new Intent(this, MadLibDisplay.class);
        // putting data from edit text fields into intent to send to other activity
        // MY_Name and MY_AGE are public constants in InfoActivity class
        intent.putExtra(MadLibDisplay.MY_GIRL, myGirl);
        intent.putExtra(MadLibDisplay.MY_ENEMY, myEnemy);
        intent.putExtra(MadLibDisplay.MY_FOOD, myFood);
        intent.putExtra(MadLibDisplay.MY_ANIMAL, myAnimal);
        intent.putExtra(MadLibDisplay.MY_YEAR, myYear);
        intent.putExtra(MadLibDisplay.MY_QUOTE, myQuote);
        // loads the next activity
        startActivity(intent);
    }
}
