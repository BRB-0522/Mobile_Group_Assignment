package com.example.mobile_group_assignment;

import android.graphics.drawable.Drawable;
import android.media.Image;

import java.util.ArrayList;
import java.util.Random;

public class BookItem {

    public String BookName;
    public int BookCover;

    BookCoverList bookCoverList = new BookCoverList();

    BookItem(String bookName){
        this.BookName = bookName;


        Random rand = new Random();
        int rand_int = rand.nextInt(bookCoverList.getBookCoverList());
        this.BookCover = rand_int;
    }

    public String getBookName(){
        return BookName;
    }

    public void setBookName(String bookName){
        this.BookName = bookName;
    }

    public int getBookCover(){
        return BookCover;
    }

    public void setBookCover(int i){
        this.BookCover=i;
    }
}
