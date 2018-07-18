package com.example.aml.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView nowplaying = (TextView) findViewById(R.id.nowplaying);
        nowplaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowplayingIntent = new Intent(MainActivity.this,NowPlaying.class);
                startActivity(nowplayingIntent);
            }
        });
        TextView myplaylist = (TextView) findViewById(R.id.myplaylist);
        myplaylist.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent myplaylistIntent = new Intent(MainActivity.this,MyPlayList.class);
                startActivity(myplaylistIntent);
            }
        });
        TextView favourite= (TextView) findViewById(R.id.favourite);
        favourite.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent favouriteIntent = new Intent(MainActivity.this,Favourite.class);
                startActivity(favouriteIntent);
            }
        });
        TextView payment = (TextView) findViewById(R.id.payment);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent paymentIntent = new Intent(MainActivity.this,Payment.class);
                startActivity(paymentIntent);
            }
        });
    }
}
