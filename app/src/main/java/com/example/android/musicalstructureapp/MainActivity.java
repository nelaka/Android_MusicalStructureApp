package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the View that shows the songs category
        TextView songs = (TextView) findViewById(R.id.songs);
        // Set a clickListener on that View
        songs.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link SongsActivity}
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                //Start the new activity
                startActivity(songsIntent);
            }
        });

        //Find the View that shows the albums category
        TextView albums = (TextView) findViewById(R.id.albums);
        // Set a clickListener on that View
        albums.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link AlbumsActivity}
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                //Start the new activity
                startActivity(albumsIntent);
            }
        });
    }
}
