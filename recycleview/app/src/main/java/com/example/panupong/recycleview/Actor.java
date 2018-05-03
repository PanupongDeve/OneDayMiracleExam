package com.example.panupong.recycleview;

public class Actor {
    private String name;
    private int resId;

    public Actor(String name, int resId) {
        this.name = name;
        this.resId = resId;
    }

    public Actor() {}

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = name;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(){
        this.resId = resId;
    }

    public String toString() {
        return getName() + ": ";
    }
}
