package com.algodatastructures.ft.SOLID;


// Interfața Worker defineste o metoda work()
interface Worker {
    void work();
}

// Interfața Eater defineste o metoda eat()
interface Eater {
    void eat();
}

// Clasa OfficeWorker implementeaza si Worker si Eater
class OfficeWorker implements Worker, Eater {
    @Override
    public void work() {
        System.out.println("Office worker is working");
    }

    @Override
    public void eat() {
        System.out.println("Office worker is eating");
    }
}

// Clasa RobotWorker implementeaza doar Worker, dar nu Eater
class RobotWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Robot worker is working");
    }
}

// Exemplu de utilizare
public class InterfaceSegregation {
    public static void main(String[] args) {
        Worker officeWorker = new OfficeWorker();
        Eater officeEater = new OfficeWorker();
        Worker robotWorker = new RobotWorker();

        officeWorker.work();
        officeEater.eat();
        robotWorker.work();
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
