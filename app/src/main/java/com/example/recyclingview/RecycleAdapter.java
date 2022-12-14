package com.example.recyclingview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {
  private ArrayList<Recycling>recyclingArrayList;

    public RecycleAdapter(ArrayList<Recycling> recyclingArrayList) {
        this.recyclingArrayList = recyclingArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_cell,parent,false);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
holder.recycleImage.setImageResource(recyclingArrayList.get(position).getImage());
holder.recycleText.setText(recyclingArrayList.get(position).getName());
    }



    @Override
    public int getItemCount() {
        return recyclingArrayList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder
    {
       private ImageView recycleImage;
       private TextView recycleText;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            recycleImage=(ImageView)itemView.findViewById(R.id.recyclecellimage);
            recycleText=(TextView) itemView.findViewById(R.id.recyclecelltext);


        }
    }
}
