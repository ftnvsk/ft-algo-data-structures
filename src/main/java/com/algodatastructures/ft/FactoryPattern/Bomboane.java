package com.algodatastructures.ft.FactoryPattern;

// clasa Bomboane implementeaza interfata DulciuriNoi si metodele ei
public class Bomboane implements Dulciuri {
    private String name;
    private double pret;
    private boolean dePost;

    public Bomboane(String name, double pret, boolean dePost) {
        this.name = name;
        this.pret = pret;
        this.dePost = dePost;
    }

    // Metoda pentru a descrie bomboanele, care ii face override la metoda cu aceeasi nume din interfata
    @Override
    public void descriere() {
        System.out.println("Bomboane: " + name);
    }

    // Metoda pentru a obtine pretul la bomboane care ii face override la metoda cu aceeasi nume din interfata
    @Override
    public double getPret() {
        return pret;
    }

    // Metoda pentru a verificare daca bomboanele sunt de post, care ii face override la metoda cu aceeasi nume din interfata
    @Override
    public boolean dePost() {
        System.out.println("Bomboanele sunt de post?? --> " + dePost);
        return dePost;
    }

}



