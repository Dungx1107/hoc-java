package model;


import java.security.PublicKey;

public class CounterModel {

    private int biendem;

    public int getBiendem() {
        return biendem;
    }

    public void setBiendem(int k) {
        biendem = k;
    }

    public CounterModel() {
        biendem = 0;
    }

    public void tangbiendem() {
        biendem++;
    }

    public void giambiendem() {
        biendem--;
    }

    public void resetbiendem() {
        biendem = 0;
    }

}
