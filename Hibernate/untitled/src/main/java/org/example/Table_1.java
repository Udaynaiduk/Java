package org.example;

import jakarta.persistence.*;

@Entity
@Table(name="MyTable")
public class Table_1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ✅ This tells Hibernate to let SQL Server auto-generate the ID
    @Column(name = "id")
    int id;

    // ✅ Default constructor (required by Hibernate)
    public Table_1() {

    }

    @Override
    public String toString() {
        return "Table_1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
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
