
import java.util.Scanner;

/* 
 * next() -> not consider withspace (eg: "pravin nalawade")-> consider only pravin
 * nextLine() -> consider withspace also;
 * 
 */

public class _05_Taking_User_Input {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();

        System.out.println("Hi," + name + " your age is " + age);

        sc.close(); //* need to close, and garbag collect remove these variables from memory
    }
}
