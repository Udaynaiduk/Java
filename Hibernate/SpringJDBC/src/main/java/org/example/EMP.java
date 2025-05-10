package org.example;

public class EMP {

    int EmpId;
    String Name;

    String Steet;

    public String getName() {
        return Name;
    }


    public void setName(String name) {
        Name = name;
    }

    public String getSteet() {
        return Steet;
    }

    public void setSteet(String steet) {
        Steet = steet;
    }

    public int getEmpId() {
        return EmpId;
    }

    @Override
    public String toString() {
        return "EMP{" +
                "EmpId=" + EmpId +
                ", Name='" + Name + '\'' +
                ", Steet='" + Steet + '\'' +
                '}';
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }
}
