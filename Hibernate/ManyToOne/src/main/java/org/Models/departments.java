package org.Models;

import jakarta.persistence.*;

@Entity
@Table(name ="departments")
public class departments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name ="department_id")
    int id;
    @Column(name = "department_name")
    String name;

    public departments(){

    }
    public departments(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
