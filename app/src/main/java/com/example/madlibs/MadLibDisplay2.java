package com.example.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class MadLibDisplay2 extends AppCompatActivity {
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
        setContentView(R.layout.activity_mad_lib_display2);
        Intent intent2 = getIntent();


        String girl = intent2.getStringExtra(MY_GIRL);
        String enemy = intent2.getStringExtra(MY_ENEMY);
        String food = intent2.getStringExtra(MY_FOOD);
        String animal = intent2.getStringExtra(MY_ANIMAL);
        String year = intent2.getStringExtra(MY_YEAR);
        String quote = intent2.getStringExtra(MY_QUOTE);

        String object = intent2.getStringExtra(MY_OBJECT);
        String guy = intent2.getStringExtra(MY_GUY);
        String planet = intent2.getStringExtra(MY_PLANET);
        String color = intent2.getStringExtra(MY_COLOR);
        String teacher = intent2.getStringExtra(MY_TEACHER);
        String number = intent2.getStringExtra(MY_NUMBER);

        String celeb = intent2.getStringExtra(MY_CELEB);
        String habit1 = intent2.getStringExtra(MY_HABIT1);
        String habit2 = intent2.getStringExtra(MY_HABIT2);
        String holiday = intent2.getStringExtra(MY_HOLIDAY);
        String store = intent2.getStringExtra(MY_STORE);
        String day = intent2.getStringExtra(MY_DAY);

        String sport = intent2.getStringExtra(MY_SPORT);
        String tv = intent2.getStringExtra(MY_TV);
        String adj = intent2.getStringExtra(MY_ADJ);
        String country = intent2.getStringExtra(MY_COUNTRY);






        String strToDisplay = "Today, we shall discuss the story of a girl named " + "<b><u><i>"+ girl +"</b></u></i>" + ". She came from the planet "+ "<b><u><i>"+ planet + "</b></u></i>" +". "+ "<b><u><i>" +
                girl +"</b></u></i>" + " looked different than most girls. She told people she came from "+ "<b><u><i>" + country + "</b></u></i>" +" , but no one understood why she looked so different. " +
                "She had " + "<b><u><i>"+ color + "</b></u></i>" +" skin, "+ "<b><u><i>" + number +"</b></u></i>" + " " + "<b><u><i>" + adj +"</b></u></i>" + " toes, and used to carry around a bag of " + "<b><u><i>"+ object +"</b></u></i>" + " wherever she went. People bullied her," +
                " but one day, she became really great friends with a girl named "+ "<b><u><i>" + enemy +"</b></u></i>" + ". They spent countless days together watching the show " + "<b><u><i>"+ tv +"</b></u></i>" + ". " +
                "Though "+ "<b><u><i>" + girl +"</b></u></i>" + " looked different, " + "<b><u><i>"+ enemy + "</b></u></i>" +" didn't care. But others did and this made "+ "<b><u><i>" + girl + "</b></u></i>" +" very insecure. Every single day, " +
                "she would go to "+ "<b><u><i>" + store + "</b></u></i>" +" to get makeup and new clothes to make herself look prettier. Finally, the most important day of the school year had finally come" +
                ". The "+ "<b><u><i>" +  holiday + " </b></u></i>" +"party hosted by the most popular guy at school: "+ "<b><u><i>" + guy + "</b></u></i>" + ". For most of the morning, "+ "<b><u><i>" + girl + "</b></u></i>" +" spent her time" +
                " perfecting her makeup and outfits so she looked as good as possible. On that " + "<b><u><i>"+ day +"</b></u></i>" + " night of the party, "+ "<b><u><i>" + girl +"</b></u></i>" + "'s life came " +
                "crumbling. People started rumoring that she had bad habits of " + "<b><u><i>"+ habit1 + "</b></u></i>" +" and " + "<b><u><i>"+ habit2 +"</b></u></i>" + ". Enough was enough and " + "<b><u><i>"+ girl + "</b></u></i>" +" was sick of " +
                "being the laughing stock of the whole group. She gave a motivational speech about true beauty and being kind which ended up going viral and got the " +
                "attention of celebrities like " + "<b><u><i>"+ celeb + "</b></u></i>" +". Now, "+ "<b><u><i>" + girl +"</b></u></i>" + " was an international sensation and proved that you can still be a cool kid even" +
                " if you are from "+ "<b><u><i>"+ planet +"</b></u></i>" + " and have "+ "<b><u><i>" + color +"</b></u></i>" + " skin and "+ "<b><u><i>" + number + "</b></u></i>" +" "+ "<b><u><i>" + adj + "</b></u></i>" +" toes";


        TextView str = (TextView) findViewById(R.id.textView2);
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

    public void backHome(View view) {
        Intent home = new Intent(this, MainActivity.class);
        startActivity(home);
    }
}
