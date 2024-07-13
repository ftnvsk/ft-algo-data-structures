package com.algodatastructures.ft;

import com.algodatastructures.ft.ObjectOrientedProgramming.abstraction.Abstraction;
import com.algodatastructures.ft.ObjectOrientedProgramming.encapsulation.Encapsulation;
import com.algodatastructures.ft.ObjectOrientedProgramming.inheritance.Inheritance;
import com.algodatastructures.ft.ObjectOrientedProgramming.polymorphism.Polymorphism;

public class OOPExercises {
    public static void main(String[] args) {
        Abstraction abstraction = new Abstraction();

        Abstraction.Circle circle = abstraction.new Circle(5.0);
        Abstraction.Triangle triangle = abstraction.new Triangle(3.0, 4.0, 5.0);
        Abstraction.Manager manager = abstraction.new Manager("Romba Bomba", 101, 50000, 1100);
        Abstraction.Programmer programmer = abstraction.new Programmer("Goran Bregovic", 102, 150.51, 160);

        // Access methods on these instances
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
        manager.getEmployeeInfo();
        programmer.getEmployeeInfo();

        Encapsulation.BankAccount myAccount = new Encapsulation.BankAccount("123456789", 1000.00);
        Encapsulation.Person person = new Encapsulation.Person("John Doe", 2, "USA");
        Inheritance.Cat myCat = new Inheritance.Cat();
        Inheritance.Car myCar = new Inheritance.Car();
        Polymorphism.NewVehicle myNewCar = new Polymorphism.NewCar();
        Polymorphism.NewVehicle myBicycle = new Polymorphism.Bicycle();
        Polymorphism.Sports myFootball = new Polymorphism.Football();
        Polymorphism.Sports myBasketball = new Polymorphism.Basketball();
        Polymorphism.Sports myRugby = new Polymorphism.Rugby();

        System.out.println("Initial Account Number: " + myAccount.getAccountNr());
        System.out.println("Initial Balance: $" + myAccount.getAccBalance());
        // Modify the account details
        myAccount.setAccountNr("987654321");
        myAccount.setAccBalance(5000.00);
        // Display updated account details
        System.out.println("Updated Account Number: " + myAccount.getAccountNr());
        System.out.println("Updated Balance: $" + myAccount.getAccBalance());
        System.out.println("Initial Name: " + person.getName());
        System.out.println("Initial Age: " + person.getAge());
        System.out.println("Initial Country: " + person.getCountry());
        // Modify the person details
        person.setName("Filip Bilip");
        person.setAge(99);
        person.setCountry("Macedonia");
        // Display updated person details
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
        System.out.println("Updated Country: " + person.getCountry());
        myCat.makeSound();
        myCar.drive();
        myNewCar.speedUp();
        myBicycle.speedUp();
        myFootball.play();
        myBasketball.play();
        myRugby.play();
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
