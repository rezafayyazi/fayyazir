package com.example.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIInterface {
    @GET("data/2.5/weather?")
    Call <User> getUsers( @Query("q") String lon, @Query("APPID") String app_id);

}
