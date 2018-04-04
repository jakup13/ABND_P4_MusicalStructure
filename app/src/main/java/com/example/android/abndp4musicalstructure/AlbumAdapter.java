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
 * AlbumList Adapter
 *
 * @author Jakub
 * @date 2018/03/24
 */

public class AlbumAdapter extends ArrayAdapter<AlbumList> {

    /**
     * Custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param albums  A List of AlbumList to display in a list
     */
    AlbumAdapter(Activity context, ArrayList<AlbumList> albums) {
        super(context, 0, albums);
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
                    R.layout.album_item, parent, false);
        }

        // Get the {@link AlbumList} object located at this position in the list
        AlbumList currentAlbum = getItem(position);

        // Find the TextView in the album_item.xml layout with the ID album_author
        TextView authorTextView = (TextView) listItemView.findViewById(R.id.album_author);
        // Get the album author name from the current AlbumList object and
        // set this text on the author TextView
        assert currentAlbum != null;
        authorTextView.setText(currentAlbum.getAuthor());

        // Find the TextView in the album_item.xml layout with the ID album_title
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.album_title);
        // Get the version number from the current AlbumList object and
        // set this text on the title TextView
        titleTextView.setText(currentAlbum.getTitle());

        // Find the ImageView in the album_item.xml layout with the ID album_item_image
        ImageView coverView = (ImageView) listItemView.findViewById(R.id.album_item_image);
        // Get the image resource ID from the current AlbumList object and
        // set the image to coverView
        coverView.setImageResource(currentAlbum.getImageResourceId());

        // Find the ImageView in the album_item.xml layout with the ID album_item_end
        ImageView albumEndView = (ImageView) listItemView.findViewById(R.id.album_item_end);
        // Get the image resource ID from the current AlbumList object and
        // set the image to coverView
        albumEndView.setImageResource(currentAlbum.getImageEndResourceId());


        // Return the whole list item layout (containing 2 TextViews and 2 ImageViews)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
