package com.prarthana.gridlayoutrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Book_Activity extends AppCompatActivity {

    private TextView tvtitle,tvDesciption,tvCategory;
    private ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_);

        tvtitle = (TextView) findViewById(R.id.bookTitle);
        tvDesciption = (TextView) findViewById(R.id.bookDescription);
        tvCategory = (TextView) findViewById(R.id.bookCategory);
        img = (ImageView) findViewById(R.id.bookThumbnail);

        //Receive Data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        int Thumbnail = intent.getExtras().getInt("Thumbnail");

        //setting values

        tvtitle.setText(Title);
        tvDesciption.setText(Description);
        img.setImageResource(Thumbnail);


    }
}