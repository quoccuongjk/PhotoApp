package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity2 extends AppCompatActivity {
    ImageView img;
    TextView ten,mota;
    Fruit fruit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Chi Tiết");
        Intent intent = getIntent();
        fruit = (Fruit) intent.getSerializableExtra("fruit");
         img = findViewById(R.id.fr_img);
        ten = findViewById(R.id.fr_t);
        mota = findViewById(R.id.fr_mt);
        ten.setText(fruit.getTen());
        mota.setText(fruit.getMota());
        Picasso.with(getApplicationContext()).load(fruit.getLink()).into(img);

    }
}