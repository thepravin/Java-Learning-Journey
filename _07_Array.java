import java.util.Scanner;

public class _07_Array {
    public static void main(String a[]) {
        /*
         * int age[];
         * age = new int[5];
         */
        
        /* 
         * int marks[] = {15,8,16,17,23};
         */

        int age[] = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            age[i] = sc.nextInt();
        }

        System.out.print("All Age's are : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(age[i] + " ");
        }
        System.out.println();
        System.out.println("Size of Array : "+age.length);

        sc.close();
    }
}
