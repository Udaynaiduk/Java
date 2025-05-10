package org.example;

public class Address {
    int dono;

    public Address(int dono, String city) {
        this.dono = dono;
        City = city;
    }

    public Address() {
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getDono() {
        return dono;
    }

    public void setDono(int dono) {
        this.dono = dono;
    }

    String City;

    public GPS getGps() {
        return gps;
    }

    public void setGps(GPS gps) {
        this.gps = gps;
    }

    GPS gps;

    @Override
    public String toString() {
        return "Address{" +
                "dono=" + dono +
                ", City='" + City + '\'' +
                '}';
    }
}
