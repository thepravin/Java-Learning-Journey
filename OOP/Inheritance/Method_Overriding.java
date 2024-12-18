
class Animal {
    public void display() {
        System.out.println("I am an animal");
    }
}

class Dog extends Animal {
    // overriding method
    public void display() {
        System.out.println("I am a dog");
    }

    public void printMessage() {
        display();
    }
}

public class Method_Overriding {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.printMessage();
    }
}
