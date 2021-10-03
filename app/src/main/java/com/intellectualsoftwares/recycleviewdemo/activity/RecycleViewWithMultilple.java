package com.intellectualsoftwares.recycleviewdemo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.intellectualsoftwares.recycleviewdemo.R;

public class RecycleViewWithMultilple extends AppCompatActivity {
RecyclerView multiViewRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view_with_multilple);

        multiViewRecyclerView=findViewById(R.id.multiViewRecyclerView);

    }
}