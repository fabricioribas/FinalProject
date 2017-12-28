package com.example.fabricio.finalproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SocialMedia extends AppCompatActivity {
    private Button btnInsta;
    private Button btnFace;
    private Button btnTwitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_media);

        btnInsta = findViewById(R.id.btn_insta);
        btnFace = findViewById(R.id.btn_face);
        btnTwitter = findViewById(R.id.btn_twitter);


        btnInsta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.instagram.com/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        btnFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.facebook.com/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        btnTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.twitter.com/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        /*Button btn_insta = (Button) findViewById(R.id.img_btn_insta);
        btn_insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToInsta();
            }
        });
    }
    protected void sendToInsta(){
        String url = "http://twitter.com";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);*/
    }
}