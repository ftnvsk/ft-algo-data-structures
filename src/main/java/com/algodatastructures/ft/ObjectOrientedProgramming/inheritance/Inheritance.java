package com.algodatastructures.ft.ObjectOrientedProgramming.inheritance;

public class Inheritance {

    /*
     *
     * Cu Inheritance-ul in OOP, este vorba practic de literalmente de mostenire de la 'parinti' la 'copii' si 'nepoti'.
     * Inheritance-ul in programare il folosim in cazul in care avem un obiect si dorim ca acel obiect sa aiba
     * mai multe 'stari'. Adica cum e exemplu de mai jos cu Animal si Cat - noi avem un obiect/parinte/familia numita
     * 'Animal' si in viata avem multe feluri si soiuri de animale, fiecare cu specificatiile sale. Cu inheritance
     *  noi create alte obiecte carora baza este obiectul mostenit dar cu specificatiile sale unice. Inheritance-ul
     * e bun pentru ca evitam sa repetam codul scris, practic re-folosim codul existent si il adaptam la nevoile
     * situatiilor noastre cea ce ajuta la intelegerea si citirea codului, cea ce inseamna si un debugging mai usor
     *
     * */

    /*
     * https://www.w3resource.com/java-exercises/index-inheritance.php
     *
     * 1. Write a Java program to create a class called Animal with a method called makeSound().
     * Create a subclass called Cat that overrides the makeSound() method to bark.
     *
     * */

    public static class Animal {
        // Constructor
        public Animal() {
            System.out.println("An animal has been created.");
        }

        // Method to simulate making a sound
        public void makeSound() {
            System.out.println("Animal makes a sound.");
        }
    }

    /*
     * Subclass Cat that extends Animal.
     */
    public static class Cat extends Animal {
        // Constructor
        public Cat() {
            System.out.println("A cat has been created.");
        }

        // Overriding the makeSound method
        @Override
        public void makeSound() {
            System.out.println("In an alternate universe, the cat barks");
        }
    }

    /*
     * https://www.w3resource.com/java-exercises/index-inheritance.php
     *
     * 2. Write a Java program to create a class called NewVehicle with a method called drive().
     * Create a subclass called Car that overrides the drive() method to print "Repairing a car".
     *
     * */

    public static class Vehicle {
        // Constructor
        public Vehicle() {
            System.out.println("A vehicle has been created.");
        }

        // Method to simulate driving
        public void drive() {
            System.out.println("Driving a vehicle.");
        }
    }

    /*
     * Subclass Car that extends NewVehicle.
     */
    public static class Car extends Vehicle {
        // Constructor
        public Car() {
            System.out.println("A car has been created.");
        }

        // Overriding the drive method
        @Override
        public void drive() {
            System.out.println("Repairing a car.");
        }
    }

}
