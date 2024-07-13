package com.algodatastructures.ft;

import com.algodatastructures.ft.BuilderPatern.DulciuriNoi;

public class BuilderPatternExercise {
    public static void main(String[] args) {
        // Buillder Pattern
        // Cream obiectul de tip DulciuriNoi cu ajutorul Builder-ului din clasa respectiva
        DulciuriNoi dulciuriNoi = new DulciuriNoi.DulciuriNoiBuilder()
                .setName("Cheesecake American")
                .setPret(199.56)
                .build();

        // Afisam detaliile obiectului creat
        System.out.println("Dulcuri noi create: " + dulciuriNoi.getName() + " cu pretul de " + dulciuriNoi.getPret() + " RON.");
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
