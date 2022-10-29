package com.nasywah.showroom;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

    public class activity_page4 extends AppCompatActivity {
    Button kembali1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page4);

        kembali1 = (Button) findViewById(R.id.toback);
        kembali1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(activity_page4.this, activity_page2.class));
            }
        });
    }
}