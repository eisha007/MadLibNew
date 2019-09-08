package com.example.madlibs;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout constraintLayout = findViewById(R.id.gradient);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(4000);
        animationDrawable.setExitFadeDuration(2000);
        animationDrawable.start();

    }

    public void sendInfo(View v) {

        // getting a reference to my edit text fields
        EditText girl = (EditText) findViewById(R.id.girlOne);
        EditText enemy = (EditText) findViewById(R.id.girlTwo);
        EditText food = (EditText) findViewById(R.id.food);
        EditText animal = (EditText) findViewById(R.id.animalOne);
        EditText year = (EditText) findViewById(R.id.year);
        EditText quote = (EditText) findViewById(R.id.quote);
        EditText object = (EditText) findViewById(R.id.object);
        EditText guy = (EditText) findViewById(R.id.guy);
        EditText planet = (EditText) findViewById(R.id.planet);
        EditText color = (EditText) findViewById(R.id.color);
        EditText teacher = (EditText) findViewById(R.id.teacher);
        EditText number = (EditText) findViewById(R.id.number);
        EditText celebrity = (EditText) findViewById(R.id.celebrity);
        EditText habit = (EditText) findViewById(R.id.habit);
        EditText habit2 = (EditText) findViewById(R.id.habit2);
        EditText holiday = (EditText) findViewById(R.id.holiday);
        EditText store = (EditText) findViewById(R.id.store);
        EditText day = (EditText) findViewById(R.id.day);
        EditText sport = (EditText) findViewById(R.id.sport);
        EditText tv = (EditText) findViewById(R.id.tv);
        EditText adjective = (EditText) findViewById(R.id.adjective);
        EditText country = (EditText) findViewById(R.id.country);


        // extracting the text from those edit text fields
        String myGirl = girl.getText().toString();
        String myEnemy = enemy.getText().toString();
        String myFood = food.getText().toString();
        String myAnimal = animal.getText().toString();
        String myYear = year.getText().toString();
        String myQuote = quote.getText().toString();
        String myObject = object.getText().toString();
        String myGuy = guy.getText().toString();
        String myPlanet = planet.getText().toString();
        String myColor = color.getText().toString();
        String myTeacher = teacher.getText().toString();
        String myNumber = number.getText().toString();
        String myCeleb = celebrity.getText().toString();
        String myHabitOne = habit.getText().toString();
        String myHabitTwo = habit2.getText().toString();
        String myHoliday = holiday.getText().toString();
        String myStore = store.getText().toString();
        String myDay = day.getText().toString();
        String mySport = sport.getText().toString();
        String myTV = tv.getText().toString();
        String myAdj = adjective.getText().toString();
        String myCountry = country.getText().toString();


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

        intent.putExtra(MadLibDisplay.MY_OBJECT, myObject);
        intent.putExtra(MadLibDisplay.MY_GUY, myGuy);
        intent.putExtra(MadLibDisplay.MY_PLANET, myPlanet);
        intent.putExtra(MadLibDisplay.MY_COLOR, myColor);
        intent.putExtra(MadLibDisplay.MY_TEACHER, myTeacher);
        intent.putExtra(MadLibDisplay.MY_NUMBER, myNumber);

        intent.putExtra(MadLibDisplay.MY_CELEB, myCeleb);
        intent.putExtra(MadLibDisplay.MY_HABIT1, myHabitOne);
        intent.putExtra(MadLibDisplay.MY_HABIT2, myHabitTwo);
        intent.putExtra(MadLibDisplay.MY_HOLIDAY, myHoliday);
        intent.putExtra(MadLibDisplay.MY_STORE, myStore);
        intent.putExtra(MadLibDisplay.MY_DAY, myDay);

        intent.putExtra(MadLibDisplay.MY_SPORT, mySport);
        intent.putExtra(MadLibDisplay.MY_TV, myTV);
        intent.putExtra(MadLibDisplay.MY_ADJ, myAdj);
        intent.putExtra(MadLibDisplay.MY_COUNTRY, myCountry);

        if (myGirl.length() <= 0 ||myEnemy.length() <= 0 || myFood.length() <= 0 || myAnimal.length() <= 0 || myYear.length() <= 0 || myQuote.length() <= 0 ||
                myObject.length() <= 0 || myGuy.length() <= 0 || myPlanet.length() <= 0 || myColor.length() <= 0 || myTeacher.length() <= 0 || myNumber.length() <= 0 ||
                myCeleb.length() <= 0 || myHabitOne.length() <= 0 || myHabitTwo.length() <= 0 || myHoliday.length() <= 0 || myStore.length() <= 0 || myDay.length() <= 0 ||
                mySport.length() <= 0 || myTV.length() <= 0 || myAdj.length() <= 0 || myCountry.length() <= 0) {
            Toast.makeText(MainActivity.this, "there are empty text boxes. please fill out ALL text boxes", Toast.LENGTH_SHORT).show();
        }
    else {
            startActivity(intent);
            overridePendingTransition(R.anim.slide_out, R.anim.slide_in) ;
        }
    }



    public void sendInfo2(View v) {
        // getting a reference to my edit text fields
        EditText girl = (EditText) findViewById(R.id.girlOne);
        EditText enemy = (EditText) findViewById(R.id.girlTwo);
        EditText food = (EditText) findViewById(R.id.food);
        EditText animal = (EditText) findViewById(R.id.animalOne);
        EditText year = (EditText) findViewById(R.id.year);
        EditText quote = (EditText) findViewById(R.id.quote);
        EditText object = (EditText) findViewById(R.id.object);
        EditText guy = (EditText) findViewById(R.id.guy);
        EditText planet = (EditText) findViewById(R.id.planet);
        EditText color = (EditText) findViewById(R.id.color);
        EditText teacher = (EditText) findViewById(R.id.teacher);
        EditText number = (EditText) findViewById(R.id.number);
        EditText celebrity = (EditText) findViewById(R.id.celebrity);
        EditText habit = (EditText) findViewById(R.id.habit);
        EditText habit2 = (EditText) findViewById(R.id.habit2);
        EditText holiday = (EditText) findViewById(R.id.holiday);
        EditText store = (EditText) findViewById(R.id.store);
        EditText day = (EditText) findViewById(R.id.day);
        EditText sport = (EditText) findViewById(R.id.sport);
        EditText tv = (EditText) findViewById(R.id.tv);
        EditText adjective = (EditText) findViewById(R.id.adjective);
        EditText country = (EditText) findViewById(R.id.country);





        // extracting the text from those edit text fields
        String myGirl = girl.getText().toString();
        String myEnemy = enemy.getText().toString();
        String myFood = food.getText().toString();
        String myAnimal = animal.getText().toString();
        String myYear = year.getText().toString();
        String myQuote = quote.getText().toString();
        String myObject = object.getText().toString();
        String myGuy = guy.getText().toString();
        String myPlanet = planet.getText().toString();
        String myColor = color.getText().toString();
        String myTeacher = teacher.getText().toString();
        String myNumber = number.getText().toString();
        String myCeleb = celebrity.getText().toString();
        String myHabitOne = habit.getText().toString();
        String myHabitTwo = habit2.getText().toString();
        String myHoliday = holiday.getText().toString();
        String myStore = store.getText().toString();
        String myDay = day.getText().toString();
        String mySport = sport.getText().toString();
        String myTV = tv.getText().toString();
        String myAdj = adjective.getText().toString();
        String myCountry = country.getText().toString();



        // Creating the intent object so I can send data

        Intent intent2 =  new Intent( this, MadLibDisplay2.class);
        intent2.putExtra(MadLibDisplay.MY_GIRL, myGirl);
        intent2.putExtra(MadLibDisplay.MY_ENEMY, myEnemy);
        intent2.putExtra(MadLibDisplay.MY_FOOD, myFood);
        intent2.putExtra(MadLibDisplay.MY_ANIMAL, myAnimal);
        intent2.putExtra(MadLibDisplay.MY_YEAR, myYear);
        intent2.putExtra(MadLibDisplay.MY_QUOTE, myQuote);

        intent2.putExtra(MadLibDisplay.MY_OBJECT, myObject);
        intent2.putExtra(MadLibDisplay.MY_GUY, myGuy);
        intent2.putExtra(MadLibDisplay.MY_PLANET, myPlanet);
        intent2.putExtra(MadLibDisplay.MY_COLOR, myColor);
        intent2.putExtra(MadLibDisplay.MY_TEACHER, myTeacher);
        intent2.putExtra(MadLibDisplay.MY_NUMBER, myNumber);

        intent2.putExtra(MadLibDisplay.MY_CELEB, myCeleb);
        intent2.putExtra(MadLibDisplay.MY_HABIT1, myHabitOne);
        intent2.putExtra(MadLibDisplay.MY_HABIT2, myHabitTwo);
        intent2.putExtra(MadLibDisplay.MY_HOLIDAY, myHoliday);
        intent2.putExtra(MadLibDisplay.MY_STORE, myStore);
        intent2.putExtra(MadLibDisplay.MY_DAY, myDay);

        intent2.putExtra(MadLibDisplay.MY_SPORT, mySport);
        intent2.putExtra(MadLibDisplay.MY_TV, myTV);
        intent2.putExtra(MadLibDisplay.MY_ADJ, myAdj);
        intent2.putExtra(MadLibDisplay.MY_COUNTRY, myCountry);

        if (myGirl.length() <= 0 ||myEnemy.length() <= 0 || myFood.length() <= 0 || myAnimal.length() <= 0 || myYear.length() <= 0 || myQuote.length() <= 0 ||
                myObject.length() <= 0 || myGuy.length() <= 0 || myPlanet.length() <= 0 || myColor.length() <= 0 || myTeacher.length() <= 0 || myNumber.length() <= 0 ||
                myCeleb.length() <= 0 || myHabitOne.length() <= 0 || myHabitTwo.length() <= 0 || myHoliday.length() <= 0 || myStore.length() <= 0 || myDay.length() <= 0 ||
                mySport.length() <= 0 || myTV.length() <= 0 || myAdj.length() <= 0 || myCountry.length() <= 0) {
            Toast.makeText(MainActivity.this, "there are empty text boxes. please fill out ALL text boxes", Toast.LENGTH_SHORT).show();
        }
        else {
            startActivity(intent2);
            overridePendingTransition(R.anim.slide_out, R.anim.slide_in) ;        }


    }

    public void backHome(View v){
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
        overridePendingTransition(R.anim.slide_out, R.anim.slide_in) ;

    }

    }

