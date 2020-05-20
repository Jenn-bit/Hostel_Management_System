package com.example.hostelmanagementsystem;

public class UserHelperClass {

    String name, dob, room, homie;

    public UserHelperClass() {

    }

    public UserHelperClass(String name, String dob, String room, String homie) {
        this.name = name;
        this.dob = dob;
        this.room = room;
        this.homie = homie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getHomie() {
        return homie;
    }

    public void setHomie(String homie) {
        this.homie = homie;
    }
}

