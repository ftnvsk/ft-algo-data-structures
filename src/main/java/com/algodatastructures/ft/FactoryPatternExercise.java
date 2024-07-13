package com.algodatastructures.ft;

import com.algodatastructures.ft.FactoryPattern.Dulciuri;
import com.algodatastructures.ft.FactoryPattern.DulciuriFactory;

public class FactoryPatternExercise {
    public static void main(String[] args) {
        DulciuriFactory dulciuriFactory = new DulciuriFactory();

        // Crearea unui obiect de tip Inghetata folosindu-ne factory
        Dulciuri inghetata = dulciuriFactory.getDulciuri("inghetata", "TopGun", 15.0, false);
        inghetata.descriere();
        System.out.println("Pret: " + inghetata.getPret());

        // Crearea unui obiect de tip Bomboane folosindu-ne de factory
        Dulciuri bomboane = dulciuriFactory.getDulciuri("Bomboane", "BUCURIA din Moldova", 5.0, true);
        bomboane.descriere();
        System.out.println("Pret: " + bomboane.getPret());
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
