package com.example.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.EditText;
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
        overridePendingTransition(R.anim.slide_out, R.anim.slide_in) ;
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


        String myMessage = "Today, we shall discuss the story of a girl named " + "<b><u><i>"+ girl +"</b></u></i>" + ". She came from the planet "+ "<b><u><i>"+ planet + "</b></u></i>" +". "+ "<b><u><i>" +
                girl +"</b></u></i>" + " looked different than most girls. She told people she came from "+ "<b><u><i>" + country + "</b></u></i>" +" , but no one understood why she looked so different. " +
                "She had " + "<b><u><i>"+ color + "</b></u></i>" +" skin, "+ "<b><u><i>" + number +"</b></u></i>" + " " + "<b><u><i>" + adjective +"</b></u></i>" + " toes, and used to carry around a bag of " + "<b><u><i>"+ object +"</b></u></i>" + " wherever she went. People bullied her," +
                " but one day, she became really great friends with a girl named "+ "<b><u><i>" + enemy +"</b></u></i>" + ". They spent countless days together watching the show " + "<b><u><i>"+ tv +"</b></u></i>" + ". " +
                "Though "+ "<b><u><i>" + girl +"</b></u></i>" + " looked different, " + "<b><u><i>"+ enemy + "</b></u></i>" +" didn't care. But others did and this made "+ "<b><u><i>" + girl + "</b></u></i>" +" very insecure. Every single day, " +
                "she would go to "+ "<b><u><i>" + store + "</b></u></i>" +" to get makeup and new clothes to make herself look prettier. Finally, the most important day of the school year had finally come" +
                ". The "+ "<b><u><i>" +  holiday + " </b></u></i>" +"party hosted by the most popular guy at school: "+ "<b><u><i>" + guy + "</b></u></i>" + ". For most of the morning, "+ "<b><u><i>" + girl + "</b></u></i>" +" spent her time" +
                " perfecting her makeup and outfits so she looked as good as possible. On that " + "<b><u><i>"+ day +"</b></u></i>" + " night of the party, "+ "<b><u><i>" + girl +"</b></u></i>" + "'s life came " +
                "crumbling. People started rumoring that she had bad habits of " + "<b><u><i>"+ habit + "</b></u></i>" +" and " + "<b><u><i>"+ habit2 +"</b></u></i>" + ". Enough was enough and " + "<b><u><i>"+ girl + "</b></u></i>" +" was sick of " +
                "being the laughing stock of the whole group. She gave a motivational speech about true beauty and being kind which ended up going viral and got the " +
                "attention of celebrities like " + "<b><u><i>"+ celebrity + "</b></u></i>" +". Now, "+ "<b><u><i>" + girl +"</b></u></i>" + " was an international sensation and proved that you can still be a cool kid even" +
                " if you are from "+ "<b><u><i>"+ planet +"</b></u></i>" + " and have "+ "<b><u><i>" + color +"</b></u></i>" + " skin and "+ "<b><u><i>" + number + "</b></u></i>" +" "+ "<b><u><i>" + adjective + "</b></u></i>" +" toes";

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
