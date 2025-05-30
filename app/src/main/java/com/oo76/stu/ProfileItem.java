package com.oo76.stu;

public class ProfileItem {
    private int imageResId;
    private String title;
    private String value;

    public ProfileItem(int imageResId, String title, String value) {
        this.imageResId = imageResId;
        this.title = title;
        this.value = value;
    }

    public int getImageResId() { return imageResId; }
    public String getTitle() { return title; }
    public String getValue() { return value; }
}