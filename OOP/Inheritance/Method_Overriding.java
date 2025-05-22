
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
        dog1.printMessage(); // I am a dog

        /* 
         * child ka object parenst ke reference ko assine kar sakte hai.
         * 
         * object means it take a space in memory and reference(variable) point that memor.
         * so, we can create object whose reference is parent class.
         * 
         *  Reference = NEW Object
         */
        Animal dog2 = new Dog();
        dog2.display(); // I am a dog
        // dog2.printMessage(); // Error : not define in type Animal class.
    }
}
