
/* 
 * abstract class can not creat objects.
 * abstract methods not contain body.
 * access throw subcalss.
 * all abstract methods should be implemented by subclass.
 * can have constructors.
 * 
 * if one method of class is abstract then , class also abstract.
 */

abstract class Vehical2 {
    abstract void accelerate();

    abstract void brakes(int wheels);

    Vehical2(){
        System.out.println("Vechical2 Constructor called...");
    }

    void honks() {
        System.out.println("Default honks");
    }
}

class Car extends Vehical2 {

    Car(){
        System.out.println("Car Constructor called...");
    }

    @Override // annotations
    void accelerate() {
        System.out.println("accelerate");
    }

    @Override
    void brakes(int wheels) {
        System.out.println(wheels);

    }

}

class Bike extends Vehical2{
    Bike(){
        System.out.println("Bike Constructor called...");        
    }
    @Override // annotations
    void accelerate() {
        System.out.println("accelerate");
    }

    @Override
    void brakes(int wheels) {
        System.out.println(wheels);

    }
}

public class abstr {
    public static void main(String[] args) {
       /*  Car c1 = new Car();
        c1.accelerate();
        c1.brakes(5); */

        Bike honda = new Bike();
        System.out.println("-----------------------------");
        Car bmw = new Car();
    }
}
