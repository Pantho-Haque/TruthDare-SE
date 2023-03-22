package com.farizma.truthdare;

public class conflict {
    float roll;
    String id,name;

    public conflict(int roll, String id, String name) {
        this.roll = roll;
        this.id = id;
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
