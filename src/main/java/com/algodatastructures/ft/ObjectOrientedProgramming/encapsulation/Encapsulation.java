package com.algodatastructures.ft.ObjectOrientedProgramming.encapsulation;

public class Encapsulation {

    /*
     * Encapsularea (daca asa se scrie corect in Romana) in OOP este folosita pentru a 'securiza' anumite bucati
     * de cod. Cu encapsularea scopul nostru este sa pastram detaliile 'ascunse' unui obiect/metoda, dar totusi
     * permitem ca acea metoda/obiect sa fie accesate prin getter si setter. In exemplul cu BankAccount de mai jos
     *  variabilele 'accBalance' si 'accountNr' nu pot fi accesate in afara clasei BankAccount. Dar ca sa putem da
     * acces la aceasta info, folosim getter si setter.
     * Cu getter-ul permitem ca alte clase/zone din programul nostru sa acceseze valorile la variabilele
     *  'accBalance' si 'accountNr' dar nu si variabilele themselves (insusi?).
     * Cu acest getter noi controlam si securizam integritatea informatiei prin definind cum sunt citite valorile.
     * Cu setter-ul permitem ca aceeasi valori sa fie modificate, dar nu si variabilele, cea ce ajuta sa prevenim
     * eventuala coruptie a datelor (gen sa introducem valori negative sau sa introducem alte caractere care nu sunt cifre).
     *
     * */

    /*
     * https://www.w3resource.com/java-exercises/encapsulation/index.php
     *
     * 2. Write a Java program to create a class called BankAccount with private instance variables accountNumber
     *  and balance. Provide public getter and setter methods to access and modify these variables.
     *
     * */

    public static class BankAccount {
        private String accountNr;
        private double accBalance;

        public BankAccount(String accountNr, double accBalance) {
            this.accountNr = accountNr;
            this.accBalance = accBalance;
        }

        public String getAccountNr() {
            return accountNr;
        }

        public void setAccountNr(String accountNr) {
            this.accountNr = accountNr;
        }

        public double getAccBalance() {
            return accBalance;
        }

        public void setAccBalance(double accBalance) {
            if (accBalance >= 0) {
                this.accBalance = accBalance;
            } else {
                System.out.println("Balance cannot be negative! :) ");
            }
        }
    }

    /*
     * https://www.w3resource.com/java-exercises/encapsulation/index.php
     *
     * 1. Write a Java program to create a class called Person with private instance variables name, age. and country.
     * Provide public getter and setter methods to access and modify these variables.
     *
     * */

    public static class Person {
        private String name;
        private int age;
        private String country;

        public Person(String name, int age, String country) {
            this.name = name;
            this.age = age;
            this.country = country;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age >= 0) {
                this.age = age;
            } else {
                System.out.println("Age cannot be negative.");
            }
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }
    }

}
