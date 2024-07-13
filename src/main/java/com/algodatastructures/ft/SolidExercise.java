package com.algodatastructures.ft;

import com.algodatastructures.ft.SOLID.SingleResponsibility;
import com.algodatastructures.ft.SOLID.OpenClosed;
import com.algodatastructures.ft.SOLID.LiskovSubstitution;
import com.algodatastructures.ft.SOLID.InterfaceSegregation;
import com.algodatastructures.ft.SOLID.DependencyInversion;

public class SolidExercise {
    public static void main(String[] args) {
        System.out.println("...Single Responsibility Principle...");
        SingleResponsibility.main(args);

        System.out.println("...Open/Closed Principle...");
        OpenClosed.main(args);

        System.out.println("...Liskov Substitution Principle...");
        LiskovSubstitution.main(args);

        System.out.println("...Interface Segregation Principle...");
        InterfaceSegregation.main(args);

        System.out.println("...Dependency Inversion Principle...");
        DependencyInversion.main(args);
    }
}
