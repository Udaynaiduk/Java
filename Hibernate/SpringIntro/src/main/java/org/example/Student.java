package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
    int id;
    String name;

    public Address getAddress() {
        return address;
    }


    public void setAddress(Address address) {
        this.address = address;
    }

    @Autowired
    Address address;

    hostel hostel;

    public Student(Mess mess) {
        this.mess = mess;
    }

    @Autowired
    Mess mess;
    public hostel getHostel() {
        return hostel;
    }

    public void setHostel(hostel hostel) {
        this.hostel = hostel;
    }

    public String getName() {
        return name;
    }

    public Student(int id, String name,Address address) {
        this.id = id;
        this.name = name;
        this.address=address;
    }

    public  Student(){

    }


    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
