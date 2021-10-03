package com.intellectualsoftwares.recycleviewdemo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.intellectualsoftwares.recycleviewdemo.R;
import com.intellectualsoftwares.recycleviewdemo.adapter.SimpleRecycleViewAdapter;
import com.intellectualsoftwares.recycleviewdemo.model.AvatarModel;

import java.util.ArrayList;

public class SimpleRecycleViewActivity extends AppCompatActivity {

    //initialized the recyclerview
RecyclerView simple_recyleview;
RecyclerView grid_recycler_view;
RecyclerView staggered_recycler_view;
RecyclerView horizontal_linear_recycler_view;

    //initialized the Adapter
SimpleRecycleViewAdapter simpleRecycleViewAdapter;


    //initialized the ArrayList
ArrayList<AvatarModel> avatarModelArrayList;

//All three types of layoutManager for Recyclerview
LinearLayoutManager linearLayoutManager,linearLayoutManagerHorizontal;
GridLayoutManager gridLayoutManager;
StaggeredGridLayoutManager staggeredGridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_recycle_view);

        //binding  the xml layout to Activity
        simple_recyleview=findViewById(R.id.simple_recyleview);
        grid_recycler_view=findViewById(R.id.grid_recycler_view);
        staggered_recycler_view=findViewById(R.id.staggered_recycler_view);
        horizontal_linear_recycler_view=findViewById(R.id.horizontal_linear_recycler_view);

        //Setting the RecyclerView
        simple_recyleview.setHasFixedSize(true);
        grid_recycler_view.setHasFixedSize(true);
        staggered_recycler_view.setHasFixedSize(true);
        horizontal_linear_recycler_view.setHasFixedSize(true);

        //Initialized the layout manager
        //setting recyclerview linearlayoutmanager with default constructor and vertical direction
        linearLayoutManager=new LinearLayoutManager(this);

        //setting recyclerview linearlayoutmanager horizontal direction with reverselayout false means it start from starting(from 1st object)
        linearLayoutManagerHorizontal=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);

        //setting recyclerview gridlayoutmanager with default constructor and vertical direction
        gridLayoutManager=new GridLayoutManager(this,2);

        //setting recycleview staggeredLayoutManager with horizontal direction
        staggeredGridLayoutManager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL);


        //setting the Layout manager for RecyclerView
        simple_recyleview.setLayoutManager(linearLayoutManager);
        horizontal_linear_recycler_view.setLayoutManager(linearLayoutManagerHorizontal);
        grid_recycler_view.setLayoutManager(gridLayoutManager);
        staggered_recycler_view.setLayoutManager(staggeredGridLayoutManager);


        //creating the arraylist instance
        avatarModelArrayList =new ArrayList<>();

        //create model class 1st object
        AvatarModel avatar=new AvatarModel();
        avatar.setName("Neeraj");
        avatar.setBio("I am very poor guy...but i want to rich and i am using education for that");
        avatar.setImage(R.drawable.male);

        //create model class 2nd object
        AvatarModel avatar1=new AvatarModel();
        avatar1.setName("Sonu");
        avatar1.setBio("He is handsome dark boy..no body loves him");
        avatar1.setImage(R.drawable.female);

        //add model class object to arraylist
        avatarModelArrayList.add(avatar);
        avatarModelArrayList.add(avatar1);

        //setting the adapter with context and arraylist
        simpleRecycleViewAdapter=new SimpleRecycleViewAdapter(SimpleRecycleViewActivity.this,avatarModelArrayList);

        //For notify recycleview Adapter when data changed
        simpleRecycleViewAdapter.notifyDataSetChanged();

        //setting the adapter to recyclerview
        simple_recyleview.setAdapter(simpleRecycleViewAdapter);
        grid_recycler_view.setAdapter(simpleRecycleViewAdapter);
        staggered_recycler_view.setAdapter(simpleRecycleViewAdapter);
        horizontal_linear_recycler_view.setAdapter(simpleRecycleViewAdapter);

    }
}