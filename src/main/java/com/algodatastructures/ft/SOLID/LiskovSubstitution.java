package com.algodatastructures.ft.SOLID;

// Clasa abstracta Pasare defineste o metoda abstracta 'move()'
abstract class Pasare {
    abstract void move();
}

// Clasa Vrabie extinde Pasare si implementeaza metoda move() cu zburat
class Vrabie extends Pasare {
    @Override
    void move() {
        fly();
    }

    void fly() {
        System.out.println("Vrabia zboara! ");
    }
}

// Clasa Strut extinde Pasare si implementeaza metoda move() cu alergat
class Strut extends Pasare {
    @Override
    void move() {
        run();
    }

    void run() {
        System.out.println("Strutul alearga! ");
    }
}

// Exemplu de utilizare
public class LiskovSubstitution {
    public static void main(String[] args) {
        Pasare vrabie = new Vrabie();
        Pasare strut = new Strut();

        vrabie.move();
        strut.move();
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}