package com.example.mobile_group_assignment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class BookHolder extends RecyclerView.ViewHolder {
    public TextView bookName;
    public ImageView bookCover;


    BookHolder(Context context, View itemView){
        super (itemView);
        bookName = itemView.findViewById(R.id.bookname);
        bookCover = itemView.findViewById(R.id.bookcover);
    }

}
