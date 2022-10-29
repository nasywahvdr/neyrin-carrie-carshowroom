package com.nasywah.showroom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class productsrow extends AppCompatActivity {
    ImageButton heartbutton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.products_row_item);

        heartbutton1 = (ImageButton) findViewById(R.id.imageView6);

        heartbutton1.setOnClickListener(
                new View.OnClickListener() {
                    public int counter1;
                    @Override
                    public void onClick(View v) {
                        counter1 +=1;
                        if (counter1 % 2 == 0) {
                            heartbutton1.setImageResource(R.drawable.heartfill);
                        }
                        else{
                            heartbutton1.setImageResource(R.drawable.ic_heart);
                        }
                    }
                }
        );
    }
}
