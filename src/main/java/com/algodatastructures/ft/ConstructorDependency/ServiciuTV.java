package com.algodatastructures.ft.ConstructorDependency;

// clasa asta implementeaza metoda transmisiune din interfata emisiune
public class ServiciuTV implements Emisiune {

    @Override
    public void transmisiune() {
        System.out.println("Transmisiune TV !!!");
    }

}
