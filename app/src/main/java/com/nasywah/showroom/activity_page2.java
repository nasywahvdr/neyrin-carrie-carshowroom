package com.nasywah.showroom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

    public class activity_page2 extends AppCompatActivity {
        Button kelogin, keabout;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.page2);

            kelogin = (Button) findViewById(R.id.tologin);
            kelogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(activity_page2.this, activity_page3.class));
                }
            });

            keabout = (Button) findViewById(R.id.toabout);
            keabout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(activity_page2.this, activity_page4.class));
                }
            });

        }
    }