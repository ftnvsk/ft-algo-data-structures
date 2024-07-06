package com.algodatastructures.ft.FactoryPattern;

// Clasa Inghetata implementeaza interfata DulciuriNoi si metodele ei
public class Inghetata implements Dulciuri {
    private String name;
    private double pret;
    private boolean dePost;

    public Inghetata(String name, double pret, boolean dePost) {
        this.name = name;
        this.pret = pret;
        this.dePost = dePost;
    }

    // Metoda pentru a descrie prajitura, care ii face override la metoda cu aceeasi nume din interfata
    @Override
    public void descriere() {
        System.out.println("Inghetata: " + name);
    }

    // Metoda pentru a obtine pretul la bomboane, care ii face override la metoda cu aceeasi nume din interfata
    @Override
    public double getPret() {
        return pret;
    }

    // Metoda pentru a verificare daca inghetata e de post, care ii face override la metoda cu aceeasi nume din interfata
    @Override
    public boolean dePost() {
        System.out.println("Ingheata este de post?? --> " + dePost);
        return dePost;
    }
}

