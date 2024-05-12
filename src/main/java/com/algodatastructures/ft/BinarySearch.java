package com.algodatastructures.ft;

import java.util.Arrays;
import com.algodatastructures.ft.ObjectOrientedProgramming.abstraction.Abstraction;
import com.algodatastructures.ft.ObjectOrientedProgramming.encapsulation.Encapsulation.*;
import com.algodatastructures.ft.ObjectOrientedProgramming.inheritance.Inheritance.*;
import com.algodatastructures.ft.ObjectOrientedProgramming.polymorphism.Polymorphism.*;

public class BinarySearch {
    public static void main(String[] args) {

        int[] nrs = {-11, 2, 4, 6, 8, 9, 10, 11, 12, 33, 55, 66, 77, 23456, 34567, 99999};
        int trgt = 2;
        String strToCheck = "calabalac";

        System.out.println("Lista: " + Arrays.toString(nrs));
        System.out.println("Din lista data, numarul " + trgt + " se afla pe index: " + search(nrs, trgt));

        System.out.println("\nOare cuvantul '" + strToCheck + "' este palindrom?");
        System.out.println(Recursivitate.isPalindrome(strToCheck));

        // -----------------

        Abstraction abstraction = new Abstraction();

        Abstraction.Circle circle = abstraction.new Circle(5.0);
        Abstraction.Triangle triangle = abstraction.new Triangle(3.0, 4.0, 5.0);
        Abstraction.Manager manager = abstraction.new Manager("Romba Bomba", 101, 50000, 1100);
        Abstraction.Programmer programmer = abstraction.new Programmer("Goran Bregovic", 102, 150.51, 160);
        BankAccount myAccount = new BankAccount("123456789", 1000.00);
        Person person = new Person("John Doe", 2, "USA");
        Cat myCat = new Cat();
        Car myCar = new Car();
        NewVehicle myNewCar = new NewCar();
        NewVehicle myBicycle = new Bicycle();
        Sports myFootball = new Football();
        Sports myBasketball = new Basketball();
        Sports myRugby = new Rugby();


        // Access methods on these instances
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
        manager.getEmployeeInfo();
        programmer.getEmployeeInfo();
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

    }
/*     ------- cu metoda de mai jos scade perf daca vorbim o lista fff mare si timpul de executie e mai mare
               pentru ca incepe de la primul item din lista si duce pana la capat pana nu gaseste target-ul

               ------------------------------------------------------------

               UPDATE: Aici avem o complexitate de timp de tipul liniar, adica cu cat cat mai multe elemente are
               Array-ul/lista sau cu cat mai mare este ceva, cu atat mai mult timp, pentru executie, e necesar
               ca sa se treaca prin toate elementele. Practic worst case scenario:
               sunt 100 elemente, noi cautam al 100lea element, sa presupunem ca 1 element ne ia 1 minut, atunci
               ne ar trebuie 100 minute ca sa gasim elementul dorit (in cazul nostru ultimul)
 */

//    public static int search(int[] nums, int target) {
//        int targetIndex = -1;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) {
//                targetIndex = i;
//            }
//        }
//        return targetIndex;
//    }

/*
        ----- cu metoda de mai jos, facem un fel de 'divide de conquer', adica cautam punctul de mijloc,
        si dupa aia incepem sa cautam daca target-ul e mai mare sau mai mic de mijlocul, si in functie de asta
        cautam targetul in prima sau in a 2a jumatate din lista. Dupa ce stabilim daca targetul e mai mare sau
        mai mic ca mijlocul, se schimba 'granitele' de stanga sau dreapta, adica daca targetul e mai mare de
        mijlocul, atunci elementul imediat de dupa mijlocul devine noua granita de stanga, si recalculam noul mijloc
        si practic am redus lista (acelasi principiu cu granita dreapta dar cu minus) si tot asa
        pana cand mijlocul este egal cu target-ul

        ------------------------------------------------------------

        UPDATE: In schimb aici timp de executie este imbunatatit, pentru ca cu fiecare executare de loop, lista se
        injumatateste, practic reducand nr-ul de executii/loop-uri. Luand acelasi exemplu ca la explicatia de la
        For-Loop (100 elem in lista, 1min per element, cautam ultimul):
        Aici cu binary search incepem practic reducand timpul la 50min, pentru ca am stabilit ca numarul cautat
        se afla in a 2a jumatate (51-100). Mergand asa pe logica asta, urmatoarea jumatate ar fi 76-100, urmata de
        89-100, urmata de 95-100, urmata de 98-100, urmata de 100, si ca timp ne ar lua cam aprox. 13min.
        (practic trecem prin 13 loop-uri/executii/pasi)

        Si cred ca putem considera lejer ca 13min < 100min ==> less exec. time is better :)

        UPDATE 2:
                 O(log N) complexity: Binary search reduce spatiul de cautare la jumatate cu fiecare iteratie
*/

    public static int search(int[] nums, int target) {
        int leftNum = 0;
        int rightNum = nums.length - 1;
        while (leftNum <= rightNum) {
            int midNum = (leftNum + rightNum) / 2;
            if (nums[midNum] == target) {
                return midNum;
            }
            if (nums[midNum] < target) {
                leftNum = midNum + 1;
            } else {
                rightNum = midNum - 1;
            }
        }
        return -1;
    }

}
