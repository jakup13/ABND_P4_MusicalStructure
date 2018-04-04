package com.example.android.abndp4musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Album Songs class
 *
 * @author Jakub
 * @date 2018/03/24
 */


public class AlbumSongs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.song_item);


        // Get the data from previous activity (selected song in the playlist) and display it
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView myTextView = (TextView) findViewById(R.id.song_author);
            TextView myTextView1 = (TextView) findViewById(R.id.song_title);
            TextView myTextView2 = (TextView) findViewById(R.id.song_duration);
            myTextView.setText(extras.getString("SONGAUTHOR"));
            myTextView1.setText(extras.getString("SONGTITLE"));
            myTextView2.setText(extras.getString("SONGDURATION"));
        }
    }
}
