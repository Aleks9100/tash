package com.example.tash;

public class User {
    private String Name, State;
    private int Age;

    public User(String Name, String State, int Age) {
    }

    public void setName(String name) {
        Name = name;
    }

    public void setState(String state) {
        State = state;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public String getState() {
        return State;
    }

    public int getAge() {
        return Age;
    }
}
