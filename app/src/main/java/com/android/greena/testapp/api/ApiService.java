package com.android.greena.testapp.api;

import com.android.greena.testapp.model.UserList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("/api/")
    Call<UserList> getJSON();
}