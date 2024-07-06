package com.algodatastructures.ft.FactoryPattern;

// Asta e clasa noastra pentru Factory, care o sa creeze obiecte de tip dulciuri
public class DulciuriFactory {

    // Mai jos avem o metoda care returneaza un obiect de tip DulciuriNoi în functie de tipul specificat
    public Dulciuri getDulciuri(String tip, String name, double pret, boolean dePost) {
        if (tip == null) {
            return null;
        }
        if (tip.equalsIgnoreCase("INGHETATA")) {
            return new Inghetata(name, pret, dePost);
        } else if (tip.equalsIgnoreCase("BOMBOANE")) {
            return new Bomboane(name, pret, dePost);
        }
        return null;
    }
}