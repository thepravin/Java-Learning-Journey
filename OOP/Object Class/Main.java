
/* 
 * what is the contract of hashcode and equals 
 * - 
 */

class Car {
    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // override the default toString()
    @Override
    public String toString() {
        return "Car Model " + model + " and year is " + year;
    }
}

public class Main {
    public static void main(String[] args) {
        Car obj = new Car("Honda", 2021);
        System.out.println(obj); // default use : obj.toString() object method and print
        System.out.println(obj.hashCode()); 
    }
}
