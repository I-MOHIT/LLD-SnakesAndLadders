package com.mohit;

import java.util.UUID;

public class User {
    private String userID;
    public String userName;
    public int position;

    public User(String userName) {
        this.userName = userName;
        this.userID = UUID.randomUUID().toString();
        this.position = 0;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
