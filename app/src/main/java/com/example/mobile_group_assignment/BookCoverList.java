package com.example.mobile_group_assignment;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BookCoverList {

    ArrayList<Integer> BookCovers = new ArrayList<Integer>();

    BookCoverList(){
        this.BookCovers.add(R.drawable.blueheart);
        this.BookCovers.add(R.drawable.bluepaint);
        this.BookCovers.add(R.drawable.branch);
        this.BookCovers.add(R.drawable.cowpattern);
        this.BookCovers.add(R.drawable.dot);
        this.BookCovers.add(R.drawable.greenflower);
        this.BookCovers.add(R.drawable.leaves);
        this.BookCovers.add(R.drawable.lemon);
        this.BookCovers.add(R.drawable.pinkshape);
    }

    public int getBookCoverList(){
        return BookCovers.size();
    }

}
