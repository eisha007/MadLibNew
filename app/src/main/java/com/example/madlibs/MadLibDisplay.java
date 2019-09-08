package com.example.madlibs;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.EditText;
import android.widget.TextView;


public class MadLibDisplay extends AppCompatActivity {
    public static final String MY_GIRL = "girl";
    public static final String MY_ENEMY = "enemy";
    public static final String MY_FOOD = "food";
    public static final String MY_ANIMAL = "animal";
    public static final String MY_YEAR = "year";
    public static final String MY_QUOTE = "quote";
    public static final String MY_OBJECT = "object";
    public static final String MY_GUY = "guy";
    public static final String MY_PLANET = "planet";
    public static final String MY_COLOR = "color";
    public static final String MY_TEACHER = "teacher";
    public static final String MY_NUMBER = "number";

    public static final String MY_CELEB = "celeb";
    public static final String MY_HABIT1 = "habit1";
    public static final String MY_HABIT2 = "habit2";
    public static final String MY_HOLIDAY = "holiday";
    public static final String MY_STORE = "store";
    public static final String MY_DAY = "day";

    public static final String MY_SPORT = "sport";
    public static final String MY_TV = "tv";
    public static final String MY_ADJ = "adj";
    public static final String MY_COUNTRY = "country";


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
        String object = intent.getStringExtra(MY_OBJECT);
        String guy = intent.getStringExtra(MY_GUY);
        String planet = intent.getStringExtra(MY_PLANET);
        String color = intent.getStringExtra(MY_COLOR);
        String teacher = intent.getStringExtra(MY_TEACHER);
        String number = intent.getStringExtra(MY_NUMBER);

        String celeb = intent.getStringExtra(MY_CELEB);
        String habit1 = intent.getStringExtra(MY_HABIT1);
        String habit2 = intent.getStringExtra(MY_HABIT2);
        String holiday = intent.getStringExtra(MY_HOLIDAY);
        String store = intent.getStringExtra(MY_STORE);
        String day = intent.getStringExtra(MY_DAY);

        String sport = intent.getStringExtra(MY_SPORT);
        String tv = intent.getStringExtra(MY_TV);
        String adj = intent.getStringExtra(MY_ADJ);
        String country = intent.getStringExtra(MY_COUNTRY);

        String strToDisplay = "Once upon a time, there was a " + "<b><u><i>" +
                animal+ "</b></u></i>" + " named " + "<b><u><i>" + girl + "</b></u></i>" + ". One day, " + "<b><u><i>"+ girl + "</b></u></i>" + " went to "+ "<b><u><i>" + store+ "</b></u></i>" + " to buy some " + "<b><u><i>"+ food + "</b></u></i>"
                + " for her " + "<b><u><i>" + holiday + "</b></u></i>" +" party. At "+ "<b><u><i>"+
                store+ "</b></u></i>" + ", " + "<b><u><i>"+ girl +"</b></u></i>" +  " saw her worst enemy : "+ "<b><u><i>" + enemy + "</b></u></i>" + " the giraffe. Why " +
                "were they enemies, you may ask. Well in the year "+ "<b><u><i>" + year +"</b></u></i>" +  ", " + "<b><u><i>" + teacher + "</b></u></i>" +" the Alpaca" +
                " and "+ "<b><u><i>" + girl + "</b></u></i>" + " were hanging out until all of a sudden, " + "<b><u><i>"+ enemy + "</b></u></i>" + " came " +
                "to their hang out sesh and started convincing "+ "<b><u><i>" + teacher + "</b></u></i>" + " that allowing their students" +
                " to cheat on tests was a good idea! "+ "<b><u><i>" + girl + "</b></u></i>" + " was not okay with this and once " + "<b><u><i>"+ teacher +"</b></u></i>" +
                " started falling on the wrong side of the tracks, "+ "<b><u><i>" + girl +"</b></u></i>" +  " 'unfriended' them " +
                "her. For years, "+ "<b><u><i>" + girl + "</b></u></i>" + " and " + "<b><u><i>"+ teacher +"</b></u></i>" + " didn't speak and " + "<b><u><i>"+ girl + "</b></u></i>" + " grew angry " +
                "that "+ "<b><u><i>" + enemy +"</b></u></i>" +  " stole her best friend and started making them do bad things. Fast" +
                " forward to their time at " + "<b><u><i>"+ store + "</b></u></i>" +" and " + "<b><u><i>"+ girl + "</b></u></i>" + " was about to head out of the store with her" +
                " recently purchased "+ "<b><u><i>" + food +"</b></u></i>" +  ". Instead of just calmly leaving " + "<b><u><i>"+ girl +"</b></u></i>" +  " threw the " + "<b><u><i>"+ food +"</b></u></i>" +
                " at "+ "<b><u><i>" + enemy + "</b></u></i>" + " and walked out of the store like a BAWSE. Moral of the story is that: "+ "<b><u><i>" + quote + "</b></u></i>";
        TextView str = (TextView) findViewById(R.id.info);
        str.setText(Html.fromHtml(strToDisplay));
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
    public void backHome2(View view) {
        Intent home2 = new Intent(this, MainActivity.class);
        startActivity(home2);
        overridePendingTransition( R.anim.slide_out, R.anim.slide_in );
    }
    public void shareInfo(View v) {

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

    /*
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
*/


        String myMessage = "Once upon a time, there was a " + "<b><u><i>" +
                animal+ "</b></u></i>" + " named " + "<b><u><i>" + girl + "</b></u></i>" + ". One day, " + "<b><u><i>"+ girl + "</b></u></i>" + " went to "+ "<b><u><i>" + store+ "</b></u></i>" + " to buy some " + "<b><u><i>"+ food + "</b></u></i>"
                + " for her " + "<b><u><i>" + holiday + "</b></u></i>" +" party. At "+ "<b><u><i>"+
                store+ "</b></u></i>" + ", " + "<b><u><i>"+ girl +"</b></u></i>" +  " saw her worst enemy : "+ "<b><u><i>" + enemy + "</b></u></i>" + " the giraffe. Why " +
                "were they enemies, you may ask. Well in the year "+ "<b><u><i>" + year +"</b></u></i>" +  ", " + "<b><u><i>" + teacher + "</b></u></i>" +" the Alpaca" +
                " and "+ "<b><u><i>" + girl + "</b></u></i>" + " were hanging out until all of a sudden, " + "<b><u><i>"+ enemy + "</b></u></i>" + " came " +
                "to their hang out sesh and started convincing "+ "<b><u><i>" + teacher + "</b></u></i>" + " that allowing their students" +
                " to cheat on tests was a good idea! "+ "<b><u><i>" + girl + "</b></u></i>" + " was not okay with this and once " + "<b><u><i>"+ teacher +"</b></u></i>" +
                " started falling on the wrong side of the tracks, "+ "<b><u><i>" + girl +"</b></u></i>" +  " 'unfriended' them " +
                "her. For years, "+ "<b><u><i>" + girl + "</b></u></i>" + " and " + "<b><u><i>"+ teacher +"</b></u></i>" + " didn't speak and " + "<b><u><i>"+ girl + "</b></u></i>" + " grew angry " +
                "that "+ "<b><u><i>" + enemy +"</b></u></i>" +  " stole her best friend and started making them do bad things. Fast" +
                " forward to their time at " + "<b><u><i>"+ store + "</b></u></i>" +" and " + "<b><u><i>"+ girl + "</b></u></i>" + " was about to head out of the store with her" +
                " recently purchased "+ "<b><u><i>" + food +"</b></u></i>" +  ". Instead of just calmly leaving " + "<b><u><i>"+ girl +"</b></u></i>" +  " threw the " + "<b><u><i>"+ food +"</b></u></i>" +
                " at "+ "<b><u><i>" + enemy + "</b></u></i>" + " and walked out of the store like a BAWSE. Moral of the story is that: "+ "<b><u><i>" + quote + "</b></u></i>";


        // These three lines can send the image to any app through any app that sends messages
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        // declare the title for when pulling up all the apps
        String chooserTitle = getString(R.string.chooser);

        // the createChooser method will select all the apps that are able to send messages
        // and will list them along with the title specified above. Whichever one you select
        // is returned, and then that activity is launched with the info passed.

        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
        startActivity(chosenIntent);
        overridePendingTransition(R.anim.slide_out, R.anim.slide_in) ;
    }



}
