package com.example.githubmanualexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "aaa1_vitaliy", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "aaa1_vitaliy_viktor1", Toast.LENGTH_SHORT).show();
    }


    private void test2(){

        //toast

    }

}


