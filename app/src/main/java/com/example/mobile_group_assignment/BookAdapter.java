package com.example.mobile_group_assignment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookHolder> {
    public ArrayList<BookItem> books;
    Context context;

    public BookAdapter(ArrayList<BookItem> bookItems,Context context){
        this.books = bookItems;
        this.context = context;
    }

    @NonNull
    @Override

    public BookHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.bookshelf_item,parent,false);
        BookHolder bookHolder = new BookHolder(context, view);

        return bookHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BookHolder holder, int position){
        BookItem book = books.get(position);
        holder.bookName.setText(book.getBookName());
        holder.bookCover.setImageResource(book.getBookCover());
    }

    @Override
    public int getItemCount(){
        return books.size();
    }

}
