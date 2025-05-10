package org.example;

public class Jio implements  Sim{
    @Override
    public void Calling() {
        System.out.println("Calling");
    }

    @Override
    public void data() {
        System.out.println("Data Connecting");
    }

    public  Jio(){
        System.out.println("Object Creation checking");
    }
}
