package com.intellectualsoftwares.recycleviewdemo.inter;

import com.intellectualsoftwares.recycleviewdemo.model.AvatarModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface MyWebServices {
    public static String BASE_URL="https://simplifiedcoding.net/demos/";

    Retrofit retrofit=new Retrofit.Builder().baseUrl(BASE_URL).
            addConverterFactory(GsonConverterFactory.create())
            .build();

    @GET("marvel")
    Call<List<AvatarModel>> getAvatarDataFromServer();


}
