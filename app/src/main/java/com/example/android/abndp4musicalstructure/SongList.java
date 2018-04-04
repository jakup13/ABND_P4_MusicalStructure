package com.example.android.abndp4musicalstructure;

/**
 * SongList
 *
 * @author Jakub
 * @date 2018/03/24
 */

public class SongList {

    /**
     * Drawable resource ID - Left Image - Play arrow
     */
    private int mItemImageId;
    /**
     * SongList artist
     */
    private String mSongAuthor;

    /**
     * SongList Title
     */
    private String mSongTitle;

    // Drawable resource ID - SongList Item Image
    private String mSongDuration;

    /**
     * Create a new SongList object = constructor
     *
     * @param imageId  is drawable of play arrow
     * @param author   is an song author
     * @param title    is the title of an song
     * @param duration is song duration
     */
    SongList(int imageId, String author, String title, String duration) {
        mItemImageId = imageId;
        mSongAuthor = author;
        mSongTitle = title;
        mSongDuration = duration;
    }


    /**
     * Get the play arrow
     */
    public int getImageResourceId() {
        return mItemImageId;
    }

    /**
     * Get the author of an song
     */
    public String getAuthor() {
        return mSongAuthor;
    }

    /**
     * Get the title of a song
     */
    public String getTitle() {
        return mSongTitle;
    }

    /**
     * Get the duration of a song
     */
    public String getDuration() {
        return mSongDuration;
    }

}
