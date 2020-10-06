package com.example.instagrammemeshare;

public class Model {
    int image;
    String name;
    String userName;

    public Model(int image, String name, String userName) {
        this.image = image;
        this.name = name;
        this.userName = userName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
