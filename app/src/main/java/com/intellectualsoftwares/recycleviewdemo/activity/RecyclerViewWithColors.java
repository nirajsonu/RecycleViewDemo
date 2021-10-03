package com.intellectualsoftwares.recycleviewdemo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.intellectualsoftwares.recycleviewdemo.R;

public class RecyclerViewWithColors extends AppCompatActivity {
RecyclerView recyleview_with_headers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_with_colors);

        recyleview_with_headers=findViewById(R.id.recyleview_with_headers);


    }
}