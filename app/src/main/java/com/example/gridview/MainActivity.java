package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        // Data to be displayed into gridview
        ArrayList<GridModel> gridModelArrayList = new ArrayList<GridModel>();
        gridModelArrayList.add(new GridModel("The Complete Android 12 Course", R.drawable.course1));
        gridModelArrayList.add(new GridModel("The Complete Java Developer Course", R.drawable.course2));
        gridModelArrayList.add(new GridModel("The Complete Kotlin Course", R.drawable.course3));
        gridModelArrayList.add(new GridModel("The Complete Data Structure & Algorithms Course", R.drawable.course4));

        // Attach the Adapter
        GridAdapter gridAdapter = new GridAdapter(this, gridModelArrayList);
        gridView.setAdapter(gridAdapter);

    }
}