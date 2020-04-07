package com.example.lovecanadaapp.adapter;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lovecanadaapp.R;
import com.example.lovecanadaapp.model.CanadaAttraction;
import com.example.lovecanadaapp.ui.AttractionListActivity;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.placeViewHolder>  {

    private ArrayList<CanadaAttraction> canadaAttractionArrayList;

    public MyAdapter(ArrayList<CanadaAttraction> canadaAttractionArrayList) {

        this.canadaAttractionArrayList = canadaAttractionArrayList;
    }

    @NonNull
    @Override
    public placeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_place,parent,false);
        placeViewHolder myViewHolder = new placeViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull placeViewHolder holder, int position) {

        CanadaAttraction canadaObject = this.canadaAttractionArrayList.get(position);

        holder.textViewName.setText(canadaObject.getPlaceName());
        holder.imgPlace.setImageResource(canadaObject.getPlaceImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent mIntent = new Intent(holder.itemView.getContext(), AttractionListActivity.class);

            }
        });
    }

    @Override
    public int getItemCount() {
        return this.canadaAttractionArrayList.size();
    }

    public class placeViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName;
        ImageView imgPlace;

        public placeViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewName = itemView.findViewById(R.id.textViewName);
            imgPlace = itemView.findViewById(R.id.imgPlace);
        }
    }
}
