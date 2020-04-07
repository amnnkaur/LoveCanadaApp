package com.example.lovecanadaapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.lovecanadaapp.R;
import com.example.lovecanadaapp.adapter.MyAdapter;
import com.example.lovecanadaapp.model.CanadaAttraction;

import java.util.ArrayList;

public class AttractionListActivity extends AppCompatActivity {

    private RecyclerView rvPlaceList;
    private ArrayList<CanadaAttraction> placeArrayList;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction_list);

        rvPlaceList = findViewById(R.id.rvPlaceList);

        populatePlaces();

        myAdapter = new MyAdapter(placeArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,
                false);
        rvPlaceList.setLayoutManager(layoutManager);
        rvPlaceList.setAdapter(myAdapter);

    }

    public void populatePlaces(){
        placeArrayList = new ArrayList<>();

      //  placeArrayList

    }
}
