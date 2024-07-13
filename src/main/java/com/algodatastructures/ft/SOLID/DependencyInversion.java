package com.algodatastructures.ft.SOLID;

// Interfata Intrerupator defineste metoda turnOn()
interface Intrerupator {
    void turnOn();
}

// Clasa Veioza implementeaza Intrerupator
class Veioza implements Intrerupator {
    @Override
    public void turnOn() {
        System.out.println("S-a aprins VEIOZA! ");
    }
}

// Clasa AerConditionat implementeaza Intrerupator
class AerConditionat implements Intrerupator {
    @Override
    public void turnOn() {
        System.out.println("AER CONDITIONAT a pornit! ");
    }
}

// Clasa InterupatorSmart depinde de interfata Switchable, dar nu neaparat si de implementarile sale
class InterupatorSmart {
    private Intrerupator device;

    public InterupatorSmart(Intrerupator device) {
        this.device = device;
    }

    public void operate() {
        device.turnOn();
    }
}

// Exemplu de utilizare
public class DependencyInversion {
    public static void main(String[] args) {
        Intrerupator veioza = new Veioza();
        Intrerupator aerConditionat = new AerConditionat();

        InterupatorSmart inrerupatorVeioza = new InterupatorSmart(veioza);
        InterupatorSmart intrerupatorAC = new InterupatorSmart(aerConditionat);

        inrerupatorVeioza.operate();
        intrerupatorAC.operate();
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
