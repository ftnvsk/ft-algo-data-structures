package com.algodatastructures.ft.ConstructorDependency;

// clasa asta implementeaza metoda transmisiune din interfata emisiune
public class ServiciuYoutube implements Emisiune {

    @Override
    public void transmisiune() {
        System.out.println("Transmisiune YOUTUBE !!!");
    }

}
