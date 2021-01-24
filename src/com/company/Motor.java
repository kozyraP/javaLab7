package com.company;

public class Motor extends Pojazd {

    public Motor(int predkosc, int liczbaKol, int liczaSzyb) {
        super.predkosc = predkosc;
        super.liczbaKol = liczbaKol;
        super.liczaSzyb = liczaSzyb;
    }

    @Override
    public String getDescription() {
        return String.format(
                        "prędkość: %d \n" +
                        "liczba kół: %d \n" +
                        "liczba szyb %d", predkosc, liczbaKol, liczaSzyb);
    }
}
