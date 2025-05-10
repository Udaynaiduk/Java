package org.example;


import javax.persistence.*;

@Entity
public class Emp {

    public Emp(int id, String name, int do_no, String steet) {
        this.id = id;
        Name = name;
        Do_no = do_no;
        Steet = steet;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Do_no=" + Do_no +
                ", Steet='" + Steet + '\'' +
                '}';
    }

    public Emp(String name, int do_no, String steet) {

        Name = name;
        Do_no = do_no;
        Steet = steet;
    }

    public Emp(){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmpId")
    int id;


    String Name;

    int Do_no;

    @Column(name = "Steet")
    String Steet;


}
