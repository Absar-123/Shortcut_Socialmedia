package com.absar.shortcutyoutube;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    TextView inst;
    Button twitter;


 //   ImageView youtube;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();


        inst = findViewById(R.id.instagram);
        twitter = findViewById(R.id.twitter);
//        youtube = findViewById(R.id.youtube);

        inst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.instagram.com/");
            }
        });


        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotourl("https://www.youtube.com/");
            }
        });





    }

    private void gotourl(String s) {

        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));



    }
}