package com.example.mobile_group_assignment;

import android.media.Image;

public class NoteItem {

    public String title, text;
    public Image image;
    public boolean bookmarked;

    NoteItem(String title, String text, Image image, boolean bookmarked){
        this.title = title;
        this.text = text;
        this.image = image;
        this.bookmarked = bookmarked;
    }

    public String getTitle(){
        return title;
    }

    public String getNote(){
        return text;
    }

    public boolean getBookmarked(){
        return bookmarked;
    }

    public Image getImage() {
        return image;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setNote(String text){
        this.text = text;
    }

    public void setImage(Image image){
        this.image = image;
    }

    public void setBookmarked(boolean bookmarked){
        this.bookmarked = bookmarked;
    }
}
