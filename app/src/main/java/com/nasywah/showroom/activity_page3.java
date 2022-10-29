package com.nasywah.showroom;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class activity_page3 extends AppCompatActivity {
    Button LoginButton;
    EditText usernamekey, passwordkey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page3);

        usernamekey = (EditText) findViewById(R.id.edit0);
        passwordkey = (EditText) findViewById(R.id.edit1);
        LoginButton = (Button) findViewById(R.id.loginb);

    LoginButton.setOnClickListener(
        new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernamekey.getText().toString();
                String password = passwordkey.getText().toString();

                if(username.equals("admin")&&password.equals("12345")){
                    Toast.makeText(getApplicationContext(),"LOGIN SUKSES", Toast.LENGTH_SHORT).show();
                    Intent login = new Intent(activity_page3.this,activity_wel.class);
                    startActivity(login);
                    finish();

                }
                else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(activity_page3.this);
                    builder.setMessage("USERNAME SALAH") .setNegativeButton("Retry",null).create().show();
                }
            }
        }
        );
    }
}