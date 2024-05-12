package com.algodatastructures.ft.ObjectOrientedProgramming.abstraction;

public class Abstraction {

    /*
     * Abstraction-ul in OOP este folosit cu scopul de a se reduce complexitatea codului prin neafisarea tuturor
     * detallilor care pot fi considerate inutile si se afiseaza doar cea ce este esential si necesar. Asta in
     * acelasi timp inseamna ca acel cod este reutilizabil si usor de intretinut.
     *
     * O clasa abstracta in mod normal poate avea metode abstracte dar si metode 'normale' (nu stiu daca au alta
     * denumire). Si ca alta clasa sa se poata folosi de metodele clasei abastracte ea trebuie sa extinda clasa
     * abastracta. Asta inseamna ca clasa abstracta doar listeaza metodele care pot fi folosite dar nu spune
     * cum sa fie folosite/implementate
     *
     * Ca un exemplu practic in viata de zi cu zi ar fi telecomanda la TV :D noi nu vedem si nici nu ne intereseaza
     * sa vedem exact cum se intampla lucrurile cand apasam butonul de volume up sau down, ci ne intereseaza sa stim
     * care este rezultatul cand apasam volume up/down. P
     *
     * */


    /*
    * https://www.w3resource.com/java-exercises/index-abstract.php
    *
    * 2. Write a Java program to create an abstract class Shape with abstract methods calculateArea() and
    * calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and implement the
    *  respective methods to calculate the area and perimeter of each shape.
     *
    * */

    abstract class Shape {

        // Abstract method to calculate the area of the shape
        public abstract double calculateArea();

        // Abstract method to calculate the perimeter of the shape
        public abstract double calculatePerimeter();

    }

    /*
     * Circle is a subclass of Shape that represents a circle.
     */
    public class Circle extends Shape {
        private double radius;

        // Constructor
        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius; // thank you google for the formula :D
        }

        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * radius; // thank you google for the formula :D
        }
    }

    /*
     * Triangle is a subclass of Shape that represents a triangle.
     */
    public class Triangle extends Shape {
        private double sideA; // length of side A
        private double sideB; // length of side B
        private double sideC; // length of side C

        // Constructor
        public Triangle(double sideA, double sideB, double sideC) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }

        /*
         * Calculates the area of the triangle using Heron's formula.
         */
        @Override
        public double calculateArea() {
            double s = (sideA + sideB + sideC) / 2;
            return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); // thank you google for the formula :D
        }

        @Override
        public double calculatePerimeter() {
            return sideA + sideB + sideC; // Sum of all sides
        }
    }

    /*
     * https://www.w3resource.com/java-exercises/index-abstract.php
     *
     * 5. Write a Java program to create an abstract class Employee with abstract methods calculateSalary()
     *  and displayInfo(). Create subclasses Manager and Programmer that extend the Employee class and implement
     * the respective methods to calculate salary and display information for each role.
     *
     * */

    abstract class Employee {

        protected String employeeName;
        protected int empoyeeId;
        protected double employeeSalary;

        // Constructor
        public Employee(String employeeName, int empoyeeId) {
            this.employeeName = employeeName;
            this.empoyeeId = empoyeeId;
        }

        // Abstract method to calculate salary
        public abstract void calculateEmployeeSalary();

        // Abstract method to display information
        public abstract void getEmployeeInfo();

    }

    // Subclass called Manager
    public class Manager extends Employee {

        private double managerSalary;
        private double bonus;

        // Constructor
        public Manager(String managerName,int managerId, double managerSalary, double bonus) {
            super(managerName, managerId);
            this.managerSalary = managerSalary;
            this.bonus = bonus;
            calculateEmployeeSalary();
        }

        // Implementing calculateEmployeeSalary for Manager
        @Override
        public void calculateEmployeeSalary() {
            this.employeeSalary = this.managerSalary + this.bonus;
        }

        // Implement getEmployeeInfo for Manager
        @Override
        public void getEmployeeInfo() {
            System.out.println("Manager ID: " + empoyeeId);
            System.out.println("Manager Name: " + employeeName);
            System.out.println("Manager Salary: " + employeeSalary + " RON.");
        }
    }

    public class Programmer extends Employee {

        private double programmerHrRate;
        private int workedHrs;

        // Constructor
        public Programmer(String programmerName,int programmerId, double programmerHrRate, int workedHrs) {
            super(programmerName, programmerId);
            this.programmerHrRate = programmerHrRate;
            this.workedHrs = workedHrs;
            calculateEmployeeSalary();
        }

        // Implementing calculateEmployeeSalary for Programmer
        @Override
        public void calculateEmployeeSalary() {
            this.employeeSalary = this.programmerHrRate + this.workedHrs;
        }

        // Implement getEmployeeInfo for Programmer
        @Override
        public void getEmployeeInfo() {
            System.out.println("Programmer ID: " + empoyeeId);
            System.out.println("Programmer Name: " + employeeName);
            System.out.println("Programmer Salary: " + employeeSalary + " RON.");
        }
    }

}
