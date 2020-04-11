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
        Toast.makeText(this, "aaa1_master_viktor", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "aaa1_master_delete1", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "aaa1_master_delete2", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "add_new_toast pull_request", Toast.LENGTH_SHORT).show();
    }
}
