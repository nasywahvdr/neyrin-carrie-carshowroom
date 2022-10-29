package com.nasywah.showroom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.nasywah.showroom.adapter.ProductAdapter;
import com.nasywah.showroom.adapter.ProductCategoryAdapter;
import com.nasywah.showroom.model.ProductCategory;
import com.nasywah.showroom.model.Products;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageButton keprofil, kesearcha;
    Button kesearch, kehome, kefav, keshow, keform;
    ProductCategoryAdapter productCategoryAdapter;
    RecyclerView productCatRecycler, prodItemRecycler;
    ProductAdapter productAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        kehome = (Button) findViewById(R.id.textView);
        kehome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, activity_wel.class));
            }
        });

        kefav = (Button) findViewById(R.id.textView3);
        kefav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, activity_favo.class));
            }
        });

        keshow = (Button) findViewById(R.id.textView2);
        keshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity.class));
            }
        });

        kesearch = (Button) findViewById(R.id.textView4);
        kesearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, activity_search.class));
            }
        });

        keprofil = (ImageButton) findViewById(R.id.imageView3);
        keprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, activity_profil.class));
            }
        });

        kesearcha = (ImageButton) findViewById(R.id.imageView2);
        kesearcha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, activity_search.class));
            }
        });

        keform = (Button) findViewById(R.id.button);
        keform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, activity_form.class));
            }
        });








        List<ProductCategory> productCategoryList = new ArrayList<>();
        productCategoryList.add(new ProductCategory(1, "Trending"));
        productCategoryList.add(new ProductCategory(2, "Most Popular"));
        productCategoryList.add(new ProductCategory(3, "All Car Showroom"));
        productCategoryList.add(new ProductCategory(4, "Full Car"));
        productCategoryList.add(new ProductCategory(5, "Custom Car Color"));
        productCategoryList.add(new ProductCategory(6, "Body of Car"));
        productCategoryList.add(new ProductCategory(7, "Back of Car"));

        setProductRecycler(productCategoryList);

        List<Products> productsList = new ArrayList<>();
        productsList.add(new Products(1, "Honda Brio", "-", "Rp. 236.000.000", R.drawable.png1));
        productsList.add(new Products(2, "Honda All New BR-V", "-", "Rp. 348.000.000", R.drawable.png2));
        productsList.add(new Products(3, "Honda City Hatchback RS", "-", "Rp. 362.000.000", R.drawable.png3));
        productsList.add(new Products(4, "Honda All New HR-V", "-", "Rp. 515.000.000", R.drawable.png4));
        productsList.add(new Products(5, "Honda CR-V", "-", "Rp. 668.000.000", R.drawable.png5));
        productsList.add(new Products(6, "Honda All New City", "-", "Rp. 365.000.000", R.drawable.png6));

        setProdItemRecycler(productsList);

    }

    private void setProductRecycler(List<ProductCategory> productCategoryList){

        productCatRecycler = findViewById(R.id.cat_recycler);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        productCatRecycler.setLayoutManager(layoutManager);
        productCategoryAdapter = new ProductCategoryAdapter(this, productCategoryList);
        productCatRecycler.setAdapter(productCategoryAdapter);

    }

    private void setProdItemRecycler(List<Products> productsList){

        prodItemRecycler = findViewById(R.id.product_recycler);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        prodItemRecycler.setLayoutManager(layoutManager);
        productAdapter = new ProductAdapter(this, productsList);
        prodItemRecycler.setAdapter(productAdapter);



    }



}
