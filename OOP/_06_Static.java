/* 
 * Static value reamin same for all object of same class.
 * It bind with the class not an object.
 * create only one copy in memory and share with all objects.
 * for using statice variable or function, not need to create object; 
 * 
 * - in static function we can not call non-static functions.because they require
 *    to create object. "Compile time error"
 * 
 * - non-static function can call static function.
 * 
 * - Static block run before constructor.
 */

class Person {
    public static int count = 10;

    public static void printHellow(){
        System.out.println("Hello");
    }

}

public class _06_Static { 
    
    static{
        System.out.println("Static Block !!!");
    }

    static void sayHi(){
        System.out.println("Say,HI");
    }

    public static void main(String args[]) {

        System.out.println("Form the main !!");

        Person p1 = new Person();
        System.out.println(p1.count); // 10
        // p1.count = 24; // OR
        Person.count = 24;
        System.out.println(Person.count); // 24

        p1.printHellow();
        Person.printHellow();
       
        sayHi(); // static methods not need object 


    }
}
