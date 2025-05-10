package org.example;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    public Address() {
    }

    public Address(int do_no, String steet) {
        Do_no = do_no;
        Steet = steet;
    }

    int Do_no;

    public int getDo_no() {
        return Do_no;
    }

    public void setDo_no(int do_no) {
        Do_no = do_no;
    }

    public String getSteet() {
        return Steet;
    }

    public void setSteet(String steet) {
        Steet = steet;
    }

    String Steet;
}
