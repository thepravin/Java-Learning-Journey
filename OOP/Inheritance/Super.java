
/* 
 * - Used to access emidiate parent class variables and methods and constructors.
 * - We can't call this and super constructor at a same time. use one at a time.
 */

class Animal {

    Animal(String animal) {
        System.out.println("Animal is " + animal);
    }

    public void display() {
        System.out.println("I am an animal");
    }
}

class Dog extends Animal {

    Dog() {
        super("Dog"); // pass the value in parent constructor
    }

    // overriding method
    @Override
    public void display() {
        System.out.println("I am a dog");
    }

    public void printMessage() {
        display();
        super.display();
    }
}

public class Super {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.printMessage();

    }
}
