package com.sample.project.model;

public class Greeting {

    private final long id;
    private final String name;

    public Greeting(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getid() {
        return id;
    }

    public String getname() {
        return name;
    }
}



