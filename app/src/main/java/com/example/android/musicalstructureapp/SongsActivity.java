package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_songs.xml layout file
        setContentView(R.layout.activity_songs);

        //Find the View that shows the playing now screen
        TextView nowplay = (TextView) findViewById(R.id.song1);
        // Set a clickListener on that View
        nowplay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link NowplayActivity}
                Intent nowplayIntent = new Intent(SongsActivity.this, NowplayActivity.class);
                //Start the new activity
                startActivity(nowplayIntent);
            }
        });
    }
}
