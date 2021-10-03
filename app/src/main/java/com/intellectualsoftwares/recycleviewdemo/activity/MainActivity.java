package com.intellectualsoftwares.recycleviewdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.intellectualsoftwares.recycleviewdemo.R;

//for extending the AppcompatActivity
public class MainActivity extends AppCompatActivity {

//Declaring the variable and assinging some value
Button simple_recyleview_btn,multiview_recyleview_btn,custom_color_recyleview_btn;

//override the method present in Activity class it run only once in whole activity life cycle
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //saving the instance of super class
        super.onCreate(savedInstanceState);

        //binding the layout file to Activity
        setContentView(R.layout.activity_main);

        viewBinding();
        addListernerToButtons();



    }

    private void addListernerToButtons() {
        //Adding the linsterner or event on view
        simple_recyleview_btn.setOnClickListener(new View.OnClickListener() {

            //override the method onClick that is a interface present in View Class
            @Override
            public void onClick(View view) {

                //For opening the one activty to from main Activity
                //startActivity present in Activity class.
                startActivity(new Intent(getApplicationContext(), SimpleRecycleViewActivity.class));
            }
        });

        multiview_recyleview_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,RecycleViewWithMultilple.class));
            }
        });
        custom_color_recyleview_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,RecyclerViewWithColors.class));
            }
        });
    }

    private void viewBinding() {
        //binding the views to  Activity
        simple_recyleview_btn=findViewById(R.id.simple_recyleview_btn);
        multiview_recyleview_btn=findViewById(R.id.multiview_recyleview_btn);
        custom_color_recyleview_btn=findViewById(R.id.custom_color_recyleview_btn);
    }
}