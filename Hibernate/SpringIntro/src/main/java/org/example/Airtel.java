package org.example;

public class Airtel implements Sim{

    @Override
    public void Calling() {
        System.out.println("Calling");
    }

    @Override
    public void data() {
        System.out.println("Data Connecting");
    }
}
