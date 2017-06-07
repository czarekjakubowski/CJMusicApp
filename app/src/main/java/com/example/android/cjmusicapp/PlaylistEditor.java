package com.example.android.cjmusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaylistEditor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist_editor);

        // Find the View that shows chosen tag and set text displayed to that tag
        TextView chosen_tag = (TextView) findViewById(R.id.music_tag_displayed);

        // Get the intent and the extras from the bundle
        Intent intent = getIntent();
        Bundle bd = intent.getExtras();

        // Set the text in the TextView to represent chosen music tag.
        if(bd != null)
        {
            String getTag = (String) bd.get("musicTag");
           chosen_tag.setText(getTag);
        }

        // Find the View that shows the album icon
        ImageView album_icon = (ImageView) findViewById(R.id.album_icon);

        // Set a click listener on that Image
        album_icon.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when album icon is clicked on.
            @Override
            public void onClick(View view) {
                Intent songInfoIntent = new Intent(PlaylistEditor.this, SongInfo.class);
                startActivity(songInfoIntent);
            }
        });

        // Find the View that shows the play icon
        ImageView play_icon = (ImageView) findViewById(R.id.play_icon);

        // Set a click listener on that Image
        play_icon.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when play icon is clicked on.
            @Override
            public void onClick(View view) {
                Intent songPlayerIntent = new Intent(PlaylistEditor.this, SongPlayer.class);
                startActivity(songPlayerIntent);
            }
        });
    }
}
