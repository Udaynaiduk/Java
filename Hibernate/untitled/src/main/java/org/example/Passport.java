package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Passport {
    @Id
    int PassortNo;

    public int getPassortNo() {
        return PassortNo;
    }

    public void setPassortNo(int passortNo) {
        PassortNo = passortNo;
    }
}
