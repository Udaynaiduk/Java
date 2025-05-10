package org.example;

import jakarta.persistence.*;

@Entity
public class Emp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="EmpId",nullable = false,unique = true)
    int id;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    Address address;
 public Emp(){

 }

    public Emp(int id, String name) {
        this.id = id;
        Name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }

    @Column(length = 50)
    String Name;

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


}
