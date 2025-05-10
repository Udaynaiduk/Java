package org.example;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int rollno;
    String Name;
    @Column(length = 50)
    String Standard;


    @ManyToOne
    @Cascade(CascadeType.ALL)
    @JoinColumn(name = "school_id") // this will be the foreign key in Student table
    School school;

    public  Student(){

    }
    public Student(String name, String standard, School school) {
        Name = name;
        Standard = standard;
        this.school = school;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
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
