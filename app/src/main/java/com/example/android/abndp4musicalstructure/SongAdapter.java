package com.example.android.abndp4musicalstructure;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * SongList Adapter
 *
 * @author Jakub
 * @date 2018/03/24
 */

public class SongAdapter extends ArrayAdapter<SongList> {

    /**
     * @param context The current context. Used to inflate the layout file.
     * @param songs   A List of SongList to display in a list
     */
    SongAdapter(Activity context, ArrayList<SongList> songs) {
        super(context, 0, songs);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_item, parent, false);
        }

        // Get the {@link SongList} object located at this position in the list
        SongList currentSong = getItem(position);

        // Find the ImageView in the song_item.xml layout with the ID song_playicon
        ImageView coverView = (ImageView) listItemView.findViewById(R.id.song_playicon);
        // Get the image resource ID from the current AlbumList object and
        // set the image to song_playicon
        assert currentSong != null;
        coverView.setImageResource(currentSong.getImageResourceId());

        // Find the TextView in the song_item.xml layout with the ID song_author
        TextView authorTextView = (TextView) listItemView.findViewById(R.id.song_author);
        // Get the album author name from the current SongList object and
        // set this text on the author TextView
        authorTextView.setText(currentSong.getAuthor());

        // Find the TextView in the song_item.xml layout with the ID song_title
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.song_title);
        // Get the song title from the current SongList object and
        // set this text on the title TextView
        titleTextView.setText(currentSong.getTitle());

        // Find the TextView in the song_item.xml layout with the ID song_duration
        TextView durationTextView = (TextView) listItemView.findViewById(R.id.song_duration);
        // Get the song title from the current SongList object and
        // set this text on the title TextView
        durationTextView.setText(currentSong.getDuration());

        // Return the whole list item layout (containing 1 ImageView and 3 TextViews)
        return listItemView;
    }

}
