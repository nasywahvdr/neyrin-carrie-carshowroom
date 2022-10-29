package com.nasywah.showroom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class activity_form extends AppCompatActivity {

    Button entergo;
    EditText formsatu, formdua, formtiga, formempat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);

        formsatu = (EditText) findViewById(R.id.form1);
        formdua = (EditText) findViewById(R.id.form2);
        formtiga = (EditText) findViewById(R.id.form3);
        formempat = (EditText) findViewById(R.id.form4);
        entergo = (Button) findViewById(R.id.enterb);


        entergo.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String satu = formsatu.getText().toString();
                        String dua = formdua.getText().toString();
                        String tiga = formtiga.getText().toString();
                        String empat = formempat.getText().toString();

                        if(satu.equals("nasywah")&&dua.equals("vadriannasywah@gmail.com")&&tiga.equals("08123456789")&&empat.equals("mentor")){
                            Toast.makeText(getApplicationContext(),"Added To Your Cart", Toast.LENGTH_SHORT).show();
                            Intent entergo = new Intent(activity_form.this,activity_form.class);
                            startActivity(entergo);
                            finish();

                        }
                        else {
                            AlertDialog.Builder builder = new AlertDialog.Builder(activity_form.this);
                            builder.setMessage("Enter Your Form Correctly!") .setNegativeButton("Retry",null).create();
                        }
                    }
                }
        );
    }


}