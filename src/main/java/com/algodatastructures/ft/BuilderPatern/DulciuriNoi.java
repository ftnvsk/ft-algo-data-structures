package com.algodatastructures.ft.BuilderPatern;

// Clasa DulciuriNoi cu un constructor privat si un builder static
public class DulciuriNoi {
    private String name;
    private double pret;

    // Constructor privat pentru a preveni instantierea directa a clasei DulciuriNoi
    private DulciuriNoi(DulciuriNoiBuilder builder) {
        this.name = builder.name;
        this.pret = builder.pret;
    }

    // Getteri pentru properties-urile la obiectul nostru in cazul in care dorim sa le afisam
    public String getName() {
        return name;
    }
    public double getPret() {
        return pret;
    }

    // Clasa de tip builder pentru DulcuriNoi
    public static class DulciuriNoiBuilder {
        private String name;
        private double pret;

        // Metoda cu care ii dam numele la dulciurile
        public DulciuriNoiBuilder setName(String name) {
            this.name = name;
            return this;
        }

        // // Metoda cu care ii dam pret la dulciurile
        public DulciuriNoiBuilder setPret(double pret) {
            this.pret = pret;
            return this;
        }

        // Metoda cu care constructium obiectul de tip DulciuriNoi
        public DulciuriNoi build() {
            return new DulciuriNoi(this);
        }
    }
}
