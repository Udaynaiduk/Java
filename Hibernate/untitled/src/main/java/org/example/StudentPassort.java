package org.example;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class StudentPassort {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int rollno;
    String Name;
    @Column(length = 50)
    String Standard;


    @OneToOne
    @Cascade(CascadeType.ALL)
    @JoinColumn(name = "P_Id") // this will be the foreign key in Student table
    Passport passport;

    public  StudentPassort(){

    }
    public StudentPassort(String name, String standard, Passport passport) {
        Name = name;
        Standard = standard;
        this.passport= passport;
    }

    public Passport getSchool() {
        return passport;
    }

    public void setSchool(Passport passport) {
        this.passport = passport;
    }

    public String getStandard() {
        return Standard;
    }

    public void setClass(String Standard) {
        Standard = Standard;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}
