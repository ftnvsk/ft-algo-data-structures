package com.algodatastructures.ft.ObjectOrientedProgramming.polymorphism;

public class Polymorphism {

    /*
     * Cu Polymorphism-ul in OOP, practic scriem un cod o data si dupa aia il refolosim oriunde avem nevoie, sa
     * facem ce dorim in functie de ce avem nevoie cu ajutorul la @Override. Ca exemplu practic cum avem mai jos
     * metoda de speedUp() la clasa NewVehicle, cand ii facem @Override noi ne folosim de metoda 'originala' si
     * cea ce face ea, dar o folosim in scopul nostru. Polymorphism-ul face ca adaugare noi obiecte sa fie mai
     * usoara fara ca sa treabuiasca sa re-inventam focul.
     *
     * */


    /*
     * https://www.w3resource.com/java-exercises/index-polymorphism.php
     *
     * 2. Write a Java program to create a class NewVehicle with a method called speedUp().
     * Create two subclasses NewCar and Bicycle.
     * Override the speedUp() method in each subclass to increase the vehicle's speed differently.
     *
     * */

    public static class NewVehicle {
        public void speedUp() {
            System.out.println("NewVehicle speeds up!");
        }
    }

    // Subclass NewCar
    public static class NewCar extends NewVehicle {
        @Override
        public void speedUp() {
            System.out.println("NewCar speeds up very slow....");
        }
    }

    // Subclass Bicycle
    public static class Bicycle extends NewVehicle {
        @Override
        public void speedUp() {
            System.out.println("Bicycle speeds up like a rocket!");
        }
    }

    /*
     * https://www.w3resource.com/java-exercises/index-polymorphism.php
     *
     * 5. Write a Java program to create a base class Sports with a method called play().
     * Create three subclasses: Football, Basketball, and Rugby.
     * Override the play() method in each subclass to play a specific statement for each sport.
     *
     * */

    public static class Sports {
        public void play() {
            System.out.println("Playing sports is fun!");
        }
    }

    // Subclass Football
    public static class Football extends Sports {
        @Override
        public void play() {
            System.out.println("Playing football!");
        }
    }

    // Subclass Basketball
    public static class Basketball extends Sports {
        @Override
        public void play() {
            System.out.println("Playing basketball!");
        }
    }

    // Subclass Rugby
    public static class Rugby extends Sports {
        @Override
        public void play() {
            System.out.println("Playing rugby!");
        }
    }

}
