package com.example.myapplication;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIclinet {
    public  static Retrofit retrofit=null;
    public  static Retrofit getclinet(){
        if (retrofit==null){
            retrofit=new Retrofit.Builder().baseUrl("http://api.openweathermap.org").addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
