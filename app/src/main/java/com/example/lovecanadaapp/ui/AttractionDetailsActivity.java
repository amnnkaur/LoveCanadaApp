package com.example.lovecanadaapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lovecanadaapp.R;
import com.example.lovecanadaapp.model.CanadaAttraction;

public class AttractionDetailsActivity extends AppCompatActivity {

    private ImageView imageViewPlace;
    private TextView textViewID;;
    private TextView textViewPlaceName;
    private TextView textViewAddress;
    private TextView textViewCity;
    private TextView textViewProvince;
    private TextView textViewDesc;

    Bundle fetchData;
    CanadaAttraction object;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction_details);

        Intent myIntent = getIntent();
        fetchData = myIntent.getBundleExtra("object");
        object = (CanadaAttraction) fetchData.getSerializable("placeDetail");

        imageViewPlace = findViewById(R.id.imageViewPlace);
        textViewID = findViewById(R.id.placeID);
        textViewPlaceName = findViewById(R.id.placeName);
        textViewAddress = findViewById(R.id.textViewAddress);
        textViewCity = findViewById(R.id.textViewCity);
        textViewProvince = findViewById(R.id.textViewProvince);
        textViewDesc = findViewById(R.id.textViewDesc);

        textViewID.setText(String.valueOf(object.getPlaceID()));
        imageViewPlace.setImageResource(object.getPlaceImage());
        textViewPlaceName.setText(object.getPlaceName());
        textViewAddress.setText(object.getAddress());
        textViewCity.setText(object.getCity());
        textViewProvince.setText(object.getProvince());
        textViewDesc.setText(object.getDescription());
    }
}
