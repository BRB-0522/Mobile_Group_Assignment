package com.example.mobile_group_assignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.ViewHolder> {

    private ArrayList<NoteItem> noteItems;

    @NonNull
    @Override
    public NoteAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteAdapter.ViewHolder holder, int position){
        holder.onBind(noteItems.get(position));
    }

    public void setNoteList(ArrayList<NoteItem> list){
        this.noteItems = list;
    }

    @Override
    public int getItemCount(){
        return noteItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView title, contents;
        ImageView imageView;
        View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.noteName);
            contents = (TextView) itemView.findViewById(R.id.noteText);
            imageView = (ImageView) itemView.findViewById(R.id.noteImage);
            view = (View) itemView.findViewById(R.id.bookmark);
        }

        void onBind(NoteItem note){
            title.setText(note.getTitle());
            contents.setText(note.getNote());
            //For image view, I think we need to consider how we retrieve the data
            if (note.getBookmarked()==true){
                view.setBackgroundResource(R.drawable.bookmark);
            }else{

                view.setBackgroundResource(0);
            }
        }
    }

}
