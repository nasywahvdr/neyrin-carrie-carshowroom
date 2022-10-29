package com.nasywah.showroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class activity_wel extends AppCompatActivity {

    ImageButton kesearchi, kehomei, kefavi, keshowi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        kehomei = (ImageButton) findViewById(R.id.wel1);
        kehomei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_wel.this, activity_wel.class));
            }
        });

        kefavi = (ImageButton) findViewById(R.id.wel2);
        kefavi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_wel.this, activity_favo.class));
            }
        });

        keshowi = (ImageButton) findViewById(R.id.wel3);
        keshowi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_wel.this, MainActivity.class));
            }
        });

        kesearchi = (ImageButton) findViewById(R.id.wel4);
        kesearchi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_wel.this, activity_search.class));
            }
        });


    }
}