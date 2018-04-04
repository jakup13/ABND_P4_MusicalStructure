package com.example.android.abndp4musicalstructure;

/**
 * AlbumList class
 *
 * @author Jakub
 * @date 2018/03/24
 */

public class AlbumList {

    /**
     * Artist
     */
    private String mAuthor;

    /**
     * Title
     */
    private String mTitle;

    /**
     * Drawable resource ID - Left Image - album cover
     */
    private int mItemImageId;

    /**
     * Drawable resource ID - Right Image - eg. an arrow
     */
    private int mItemEndImageId;

    /**
     * Create a new AlbumList object - constructor
     *
     * @param author     is an album author
     * @param title      is the title of an album
     * @param imageId    is drawable of album cover
     * @param imageEndId is drawable of arrow or some other image
     */
    AlbumList(String author, String title, int imageId, int imageEndId) {
        mAuthor = author;
        mTitle = title;
        mItemImageId = imageId;
        mItemEndImageId = imageEndId;
    }

    /**
     * Get the author
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Get the title
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Get the AlbumList Item Image resource ID (cover)
     */
    public int getImageResourceId() {
        return mItemImageId;
    }

    /**
     * Get the AlbumList Item End Image resource ID (arrow)
     */
    public int getImageEndResourceId() {
        return mItemEndImageId;
    }

}
