package com.example.bestoption;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    public void signin (View v ){
            startActivity(new Intent(MainActivity.this,LoginActivity.class));
    }
    public void signup (View v ){
        startActivity(new Intent(MainActivity.this,signup.class));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}