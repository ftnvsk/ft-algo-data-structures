package com.algodatastructures.ft;

import com.algodatastructures.ft.ConstructorDependency.Emisiune;
import com.algodatastructures.ft.ConstructorDependency.FurnizorServiciuConsumator;
import com.algodatastructures.ft.ConstructorDependency.ServiciuTV;
import com.algodatastructures.ft.ConstructorDependency.ServiciuYoutube;

public class ConstrDepedencyExercise {
    public static void main(String[] args) {
        // Utilizare ServiciuTV
        Emisiune serviciuTV = new ServiciuTV();
        FurnizorServiciuConsumator consumatorTV = new FurnizorServiciuConsumator(serviciuTV);
        consumatorTV.procesareMesaje("Mesaj pentru TV");

        // Utilizare ServiciuYoutube
        Emisiune serviciuYoutube = new ServiciuYoutube();
        FurnizorServiciuConsumator consumatorYoutube = new FurnizorServiciuConsumator(serviciuYoutube);
        consumatorYoutube.procesareMesaje("Mesaj pentru YouTube");
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
