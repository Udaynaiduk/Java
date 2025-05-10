package org.example;

import org.springframework.beans.factory.annotation.Value;

public class properties {

    @Value("${id}")
    int id;
    @Value("${firstname}")
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
