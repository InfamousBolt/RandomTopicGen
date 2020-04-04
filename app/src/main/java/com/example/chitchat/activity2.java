package com.example.chitchat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class activity2  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        TextView genText = (TextView) findViewById(R.id.topicGenerated);
        genText.setText(MainActivity.topic);

    }
    ArrayList<ArrayList<String>> choices1 = MainActivity.choices;

    public void next(View view) {
        Log.d("ChoiceInNext",choices1.toString());
        if (choices1.isEmpty()) {
            MainActivity.topic = "Wow!You have covered all the topics in that interest.";
            Button next = (Button) findViewById(R.id.next);
            next.setVisibility(View.INVISIBLE);
        } else {
            Random random = new Random();
            int index = random.nextInt(choices1.size());
            ArrayList<String> chose = choices1.get(index);
            int newIndex = random.nextInt(chose.size());
            MainActivity.topic = chose.get(newIndex);
            chose.remove(MainActivity.topic);
            if (chose.isEmpty()) {
                choices1.remove(chose);
            }
        }
        TextView genText = (TextView) findViewById(R.id.topicGenerated);
        genText.setText(MainActivity.topic);


    }
}
