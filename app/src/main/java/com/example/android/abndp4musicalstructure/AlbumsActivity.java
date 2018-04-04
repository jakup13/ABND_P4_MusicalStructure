package com.example.android.abndp4musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Albums Activity class
 *
 * @author Jakub
 * @date 2018/03/24
 */

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.albums_list);

        // Create an ArrayList of AlbumList
        final ArrayList<AlbumList> albums = new ArrayList<AlbumList>();
        albums.add(new AlbumList(getString(R.string.str_auth_acdc), getString(R.string.str_acdc_albumtitle1), R.drawable.ac_dc, R.drawable.ic_keyboard_arrow_right));
        albums.add(new AlbumList(getString(R.string.str_auth_faith_no_more), getString(R.string.str_fnm_albumtitle1), R.drawable.faith_no_more, R.drawable.ic_keyboard_arrow_right));
        albums.add(new AlbumList(getString(R.string.str_auth_manowar), getString(R.string.str_manowar_albumtitle1), R.drawable.manowar, R.drawable.ic_keyboard_arrow_right));
        albums.add(new AlbumList(getString(R.string.str_auth_qr), getString(R.string.str_qr_albumtitle1), R.drawable.quiet_riot, R.drawable.ic_keyboard_arrow_right));

        // Create an {@link AlbumAdapter}, whose data source is a list of
        // {@link albums}. The adapter knows how to create list item views for each item
        // in the list.
        AlbumAdapter adapter = new AlbumAdapter(this, albums);

        // Get a reference to the ListView, and attach the adapter to the listView.
        final ListView listView = (ListView) findViewById(R.id.album_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent albumSongs = new Intent(AlbumsActivity.this, SongsActivity.class);

                // Pass album author's name to albumSongs
                albumSongs.putExtra("mSongAuthor", position);
                startActivity(albumSongs);
            }


        });
    }
}
