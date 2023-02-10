package com.example.fesib_check_10022023_1704;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mathoperations.MathUtils;

public class MainActivity extends AppCompatActivity {

MathUtils mu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("In Main Act");
        System.out.println(mu.performAdd(10,12));


    }
}