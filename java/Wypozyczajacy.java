/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bibliotekaxml;

import java.util.TimeZone;

/**
 *
 * @author lenovo
 */
public class Wypozyczajacy {
    private String imie;
    private String nazwisko;
    private Ksiazka ksiazka;
    private TimeZone timeZone;

    public Wypozyczajacy(String imie, String nazwisko, Ksiazka ksiazka, Integer timeZone) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.ksiazka = ksiazka;
        this.timeZone = TimeZone.getTimeZone(timeZone.toString());
    }
    public String wypozyczKsiazke(Ksiazka ksiazka){
        if(ksiazka.isDostepnosc()){
            ksiazka.setDostepnosc(false);
            return "Wypozyczam ksiazke "+ksiazka.getTytul();
        }
        return ksiazka.getTytul()+" zostala juz wypozyczona";
    }
    public String zwroc(Ksiazka ksiazka){
        ksiazka.setDostepnosc(false);
        return "Zwrocono "+ksiazka.getTytul();
    }

    @Override
    public String toString() {
        return "Wypozyczajacy{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", ksiazka=" + ksiazka + '}'+" strefa czasowa " +timeZone.getDisplayName();
    }    
}
