package com.example.georgelin.collagelistview;

import java.util.List;

/**
 * Created by georgelin on 11/14/14.
 */
public class Album {

    private String mTitle;
    private List<String> mUrls;

    public Album(String title, List<String> urls) {
        mTitle = title;
        mUrls = urls;
    }

    public String getTitle() {
        return mTitle;
    }

    public List<String> getUrls() {
        return mUrls;
    }
}
