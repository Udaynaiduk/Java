package org.Models;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "employees")
public class employees {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employee_id")
    int id;

   @Column(name="employee_name")
    String name;

   @ManyToOne
   @JoinColumn(name = " department_id")
   @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private departments departments;

    public employees() {
    }

    public employees(String name, departments departments) {
        this.name = name;
        this.departments = departments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public departments getDepartments() {
        return departments;
    }

    public void setDepartments(departments departments) {
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
