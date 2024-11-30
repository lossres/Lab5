package com.example.lab5.services;

import java.util.ArrayList;

public interface ApiServices {
    public static String BASE_URL = "http://10.24.46.1:3000/api/";

    @GET("get-list-distributor")
    Call<Response<ArrayList<Distributor>>> getListDistributor();

    @GET("search-distributor")
    Call<Response<ArrayList<Distributor>>> searchDistributor(@Query("key") String key);

    @POST("add-distributor")
    Call<Response<ArrayList<Distributor>>> addDistributor(@Body Distributor distributor);

    @PUT("update-distributor-by-id/{id}")
    Call<Response<ArrayList<Distributor>>> updateDistributor(@Path("id") String id,@Body Distributor distributor);

    @DELETE("destroy-distributor-by-id/{id}")
    Call<Response<ArrayList<Distributor>>> deleteDistributor(@Path("id") String id);
}
