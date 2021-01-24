package com.company;

public class Samochod extends Pojazd {

    public Samochod(int predkosc, int liczbaKol, int liczaSzyb) {
        super.predkosc = predkosc;
        super.liczbaKol = liczbaKol;
        super.liczaSzyb = liczaSzyb;
    }

    public Samochod(int predkosc, int liczbaKol) {
        super.predkosc = predkosc;
        super.liczbaKol = liczbaKol;
        super.liczaSzyb = 0;
    }

    public Samochod() {
        super.predkosc = 0;
        super.liczbaKol = 2;
        super.liczaSzyb = 1;
    }

    @Override
    public String getDescription() {
        return String.format(
                        "prędkość: %d \n" +
                        "liczba kół: %d \n" +
                        "liczba szyb %d", predkosc, liczbaKol, liczaSzyb);
    }
}
