
/* 
 * abstract class can not creat objects.
 * abstract methods not contain body.
 * access throw subcalss.
 * all abstract methods should be implemented by subclass.
 * 
 * if one method of class is abstract then , class also abstract.
 */

abstract class Vehical2{
    abstract void accelerate();
    abstract void brakes(int wheels);

    void honks(){
        System.out.println("Default honks");
    }
}

class Car extends Vehical2 {

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
        Car c1 = new Car();
        c1.accelerate();
        c1.brakes(5);
    }
}
