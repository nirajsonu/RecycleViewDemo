package com.intellectualsoftwares.recycleviewdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.intellectualsoftwares.recycleviewdemo.R;
import com.intellectualsoftwares.recycleviewdemo.model.AvatarModel;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class SimpleRecycleViewAdapter extends RecyclerView.Adapter<SimpleRecycleViewAdapter.ViewHolder> {

    //make private variable to assign in constructor

    //for calling anywhere either activity or fragment
   private Context context;

   //for holding the data of model class
   private ArrayList<AvatarModel> avatarModelArrayList;

   //Making a constructor of the Adapter class
    public SimpleRecycleViewAdapter(Context context, ArrayList<AvatarModel> avatarModelArrayList) {
        this.context = context;
        this.avatarModelArrayList = avatarModelArrayList;
    }


    //For inflating the view of layout to recyclerview
    @NonNull
    @Override
    public SimpleRecycleViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.simple_recycleview_layout,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }


    //For Binding the layout view to viewholder
    @Override
    public void onBindViewHolder(@NonNull SimpleRecycleViewAdapter.ViewHolder holder, int position) {
        holder.description_txt.setText(avatarModelArrayList.get(position).getBio());
        holder.name_txt.setText(avatarModelArrayList.get(position).getName());
        holder.profile_image.setImageResource(avatarModelArrayList.get(position).getImage());

    }


    //To repeat items with the size of arraylist
    @Override
    public int getItemCount()
    {
        return avatarModelArrayList.size();
    }


    //To Extends the Viewholder class and take ids form the item layout
    public class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView profile_image;
        TextView name_txt,description_txt;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            profile_image=itemView.findViewById(R.id.profile_image);
            name_txt=itemView.findViewById(R.id.name_txt);
            description_txt=itemView.findViewById(R.id.description_txt);
        }
    }
}
