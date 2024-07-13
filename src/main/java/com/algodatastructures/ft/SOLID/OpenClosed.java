package com.algodatastructures.ft.SOLID;

// Clasa abstracta Shape este deschisa pentru extindere prin mostenire
abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Adaugam o nouam forma fara sa modificam cea ce avem deja
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

// Exemplu de utilizare
public class OpenClosed {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 5);
        Shape circle = new Circle(7);
        Shape triangle = new Triangle(6, 8);

        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Circle area: " + circle.area());
        System.out.println("Triangle area: " + triangle.area());
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
