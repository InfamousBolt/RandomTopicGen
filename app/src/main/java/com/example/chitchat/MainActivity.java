package com.example.chitchat;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    boolean hasAlien, hasBook, hasContro, hasFashion, hasFitness, hasFam, hasEats, hasGame, hasGhost, hasTrend, hasLove, hasMovie, hasMusic,
            hasMyth, hasNSFW, hasPersonal, hasPolitic, hasScience, hasSchool, hasSports, hasTech, hasTravel;
    public void checks(View view){
        CheckBox Alien = (CheckBox) findViewById(R.id.aliens);
        hasAlien = Alien.isChecked();
        CheckBox Book = (CheckBox) findViewById(R.id.books);
        hasBook = Book.isChecked();
        CheckBox Contro = (CheckBox) findViewById(R.id.contro);
        hasContro = Contro.isChecked();
        CheckBox Fashion = (CheckBox) findViewById(R.id.fashion);
        hasFashion = Fashion.isChecked();
        CheckBox Fitness = (CheckBox) findViewById(R.id.fitness);
        hasFitness = Fitness.isChecked();
        CheckBox Fam = (CheckBox) findViewById(R.id.fam);
        hasFam = Fam.isChecked();
        CheckBox Eats = (CheckBox) findViewById(R.id.eats);
        hasEats = Eats.isChecked();
        CheckBox Game = (CheckBox) findViewById(R.id.game);
        hasGame = Game.isChecked();
        CheckBox Ghost = (CheckBox) findViewById(R.id.ghost);
        hasGhost = Ghost.isChecked();
        CheckBox Trend = (CheckBox) findViewById(R.id.trend);
        hasTrend = Trend.isChecked();
        CheckBox Love = (CheckBox) findViewById(R.id.love);
        hasLove = Love.isChecked();
        CheckBox Movie = (CheckBox) findViewById(R.id.movies);
        hasMovie = Movie.isChecked();
        CheckBox Music = (CheckBox) findViewById(R.id.music);
        hasMusic = Music.isChecked();
        CheckBox Myth = (CheckBox) findViewById(R.id.myth);
        hasMyth = Myth.isChecked();
        CheckBox NSFW = (CheckBox) findViewById(R.id.nsfw);
        hasNSFW = NSFW.isChecked();
        CheckBox Personal = (CheckBox) findViewById(R.id.personal);
        hasPersonal = Personal.isChecked();
        CheckBox Politic = (CheckBox) findViewById(R.id.politic);
        hasPolitic = Politic.isChecked();
        CheckBox Science = (CheckBox) findViewById(R.id.science);
        hasScience = Science.isChecked();
        CheckBox School = (CheckBox) findViewById(R.id.school);
        hasSchool = School.isChecked();
        CheckBox Sport = (CheckBox) findViewById(R.id.sports);
        hasSports = Sport.isChecked();
        CheckBox Tech = (CheckBox) findViewById(R.id.tech);
        hasTech = Tech.isChecked();
        CheckBox Travel = (CheckBox) findViewById(R.id.travel);
        hasTravel = Travel.isChecked();
    }
    ArrayList<String> cAlien = new ArrayList<String>();
    ArrayList<String> cBooks = new ArrayList<String>();
    ArrayList<String> cContro = new ArrayList<String>();
    public void addTopic(){
        cAlien.add("What do you think that aliens look like? Do you think that they have a classic ETI look?");
        cAlien.add("Do you think Aliens exist? Discuss your views.");
        cAlien.add("Imagine, one day you saw a UFO crashed in a deserted forest and a cute yet smart alien comes out of it. What do you do?");
        cAlien.add("Will aliens eventually invade Earth? What will be the situation like if they do?");
        cAlien.add("Imagine you getting abducted by a UFO. When you open your eyes, you see aliens operating on your body.What do you do?");
        cAlien.add("Would you like to believe that aliens are friendly or hostile? Geez! They better not be hostile :|");
        cAlien.add("What is the possible reason that aliens didn't visit Earth till now? Or maybe, they did!");
        cAlien.add("If you ever get a chance to visit Area 51, what do you think you will find there? Make a story of how the events will unfold.");
        cBooks.add("Which is your favourite book and why?");
        cBooks.add("If you could become a character of any book, who would you be?");
        cBooks.add("Most people say the book is better than the movie. Is this true for you?");
        cBooks.add("Which genre do you enjoy the most? PS: I personally prefer mystery!");
        cBooks.add("If you were an author and you need to create a character for a book, what traits would you give to it?");
        cContro.add("Do you think government should have any legal take in abortion?");


    }

    public static ArrayList<ArrayList<String>> choices= new ArrayList<ArrayList<String>>();
    public void putChoice(){
        if(hasAlien){
            choices.add(cAlien);
        }
        if(hasBook){
            choices.add(cBooks);
        }
        if(hasContro){
            choices.add(cContro);
        }
        if(hasFashion){
            choices.add(cAlien);
        }
        if(hasFitness){
            choices.add(cAlien);
        }
        if(hasFam){
            choices.add(cAlien);
        }
        if(hasEats){
            choices.add(cAlien);
        }
        if(hasGame){
            choices.add(cAlien);
        }
        if(hasGhost){
            choices.add(cAlien);
        }
        if(hasTrend){
            choices.add(cAlien);
        }
        if(hasLove){
            choices.add(cAlien);
        }
        if(hasMovie){
            choices.add(cAlien);
        }
        if(hasMusic){
            choices.add(cAlien);
        }
        if(hasMyth){
            choices.add(cAlien);
        }
        if(hasNSFW){
            choices.add(cAlien);
        }
        if(hasPersonal){
            choices.add(cAlien);
        }
        if(hasPolitic){
            choices.add(cAlien);
        }
        if(hasScience){
            choices.add(cAlien);
        }
        if(hasSchool){
            choices.add(cAlien);
        }
        if(hasSports){
            choices.add(cAlien);
        }
        if(hasTech){
            choices.add(cAlien);
        }
        if(hasTravel){
            choices.add(cAlien);
        }
    }
    public static String topic;



    public void generateTopic(View view) {
        cAlien.clear();
        cBooks.clear();
        checks(view);
        addTopic();
        Log.d("alien",cAlien.toString());
        Log.d("book",cBooks.toString());

        putChoice();
        Log.d("ChoiceInGen1",choices.toString());
        Intent secondScreen = new Intent(MainActivity.this, activity2.class);


        if (choices.isEmpty()) {
            topic = "Wow!You have covered all the topics in that interest.";
        }
        else{
            Random random = new Random();
            int index = random.nextInt(choices.size());
            ArrayList<String> chose = choices.get(index);
            int newIndex = random.nextInt(chose.size());
            topic = chose.get(newIndex);
            chose.remove(topic);
            if(chose.isEmpty()){
                choices.remove(chose);
            }

        }

        if (secondScreen.resolveActivity(getPackageManager()) != null) {
            startActivity(secondScreen);
        }

    }
}
