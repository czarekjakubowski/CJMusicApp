package com.example.android.cjmusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the playlist editor with music with "study" tag
        Button study = (Button) findViewById(R.id.study);

        // Set a click listener on that Button
        study.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Study Buton is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistEditor.class);
                playlistIntent.putExtra("musicTag", "Study");
                startActivity(playlistIntent);
            }
        });

        // Find the View that shows the playlist editor with music with "workout" tag
        Button workout = (Button) findViewById(R.id.workout);

        // Set a click listener on that Button
        workout.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Workout Buton is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistEditor.class);
                playlistIntent.putExtra("musicTag", "Workout");
                startActivity(playlistIntent);
            }
        });

        // Find the View that shows the playlist editor with music with "dream" tag
        Button dream = (Button) findViewById(R.id.dream);

        // Set a click listener on that Button
        dream.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Dream Buton is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistEditor.class);
                playlistIntent.putExtra("musicTag", "Dream");
                startActivity(playlistIntent);
            }
        });

        // Find the View that shows the playlist editor with music with "Have fun" tag
        Button haveFun = (Button) findViewById(R.id.havefun);

        // Set a click listener on that Button
        haveFun.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Have Fun Buton is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistEditor.class);
                playlistIntent.putExtra("musicTag", "Have Fun");
                startActivity(playlistIntent);
            }
        });
    }
}
