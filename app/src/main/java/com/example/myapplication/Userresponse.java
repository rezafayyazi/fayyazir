package com.example.myapplication;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Userresponse {
    @SerializedName("user")
    private List<User> user;

    public List<User> getUsers() {
        return user;
    }

    public void setUsers(List<User> user) {
        this.user = user;
    }
}
