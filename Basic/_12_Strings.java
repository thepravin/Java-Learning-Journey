
/* 
 * - String is "Non-premative" Data Type.
 * 
 * - Strings are immutable means, ones value assine then in feature
 *   value will change, means new value created in mermory not overwrite on previous
 *   memory storage. Previous value also present in pool.
 * 
 * - so, here garbage collect comes and check is there is value which not reference any one then
 *   remove it.
 * 
 * -> "==" :) check actual references of that string.
 * 
 * -> "equals()" :) compare string values.
 * 
 * -> 
 * 
 */

import java.util.Scanner;

public class _12_Strings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("3"+2+1); // 321
        System.out.println(2+1+"3"); // 33

        // Give Input : Pravin Nalawade
        String name = sc.nextLine();
        System.out.println(name); // Pravin Nalawade

        String name2 = sc.next();
        System.out.println(name2); // Pravin

        /*
         * -------------> String Pool <-------------------
         * The String Pool (or String Intern Pool) is a part of the Java Heap memory.
         * It is a special area used to store string literals.
         * When you create a string using string literals, Java first checks the pool.
         * If the string exists, it reuses the reference to the object. Otherwise, it
         * creates a new string object in the pool.
         */
        String s1 = "Pravin";
        String s2 = "Pravin";
        System.out.println(s1 == s2); // true

        // *---------------------------------------------------------------------------

        /*
         * ------------------> Using 'new' Keyword <-------------------------
         * When you create a string using the new keyword, a new object is always
         * created in the Heap memory, regardless of whether the same string exists in
         * the String Pool.
         * These strings are not automatically added to the pool unless explicitly done
         * using the intern() method.
         */
        String s3 = new String("Pravin");
        String s4 = new String("Pravin");
        System.out.println(s3 == s4); // false

        // *---------------------------------------------------------------------------
        /*
         * ---------------> String Interning <-------------------------
         * The intern() method can be used to add a string created using "new" to the
         * String Pool or retrieve a reference from the pool if it already exists.
         */
        String s5 = new String("Hello");
        String s6 = s5.intern();
        String s7 = "Hello";
        System.out.println(s7 == s6);// true

        // *--------------------------------------------------------------------------------

        if (s5 == s7) {
            System.out.println("s5 and s7 are same");
        } else {
            System.out.println("s5 and s7 not same");
        }

        if (s7.equals(s5)) {
            System.out.println("s5 and s7 are same");
        } else {
            System.out.println("s5 and s7 not same");
        }

        sc.close();
    }
}
