package com.company;

public abstract class Pojazd {
    protected int predkosc;
    protected int liczbaKol;
    protected int liczaSzyb;

    public abstract String getDescription();

    public void drive() {
        System.out.println("Jadę");
    }
}
