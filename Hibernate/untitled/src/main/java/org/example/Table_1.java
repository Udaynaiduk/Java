package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Table_1 {

    @Id
    int id;

    // ✅ Default constructor (required by Hibernate)
    public Table_1() {

    }
    public Table_1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
