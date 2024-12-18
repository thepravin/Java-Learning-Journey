/* 
 * Static value reamin same for all object of same class.
 * It bind with the class not an object.
 * create only one copy in memory and share with all objects.
 * for using statice variable or function, not need to create object; 
 */

class Person {
    public static int count = 10;

}

public class _06_Static {
    public static void main(String args[]) {
        Person p1 = new Person();
        System.out.println(p1.count); // 10
        // p1.count = 24; // OR
        Person.count = 24;
        System.out.println(Person.count); // 24

        Math.max(3, 4)
    }
}
