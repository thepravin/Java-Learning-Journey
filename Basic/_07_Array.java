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

     /*    int age[] = new int[5];

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

        sc.close(); */

        //* --------- 2D Arrays ----------------- */
        /* 
         * -> Read how 2D arrays store in memory (in Java)
         */

        int matrix [][] = new int[3][3];
        int r = matrix.length;
        int c = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               System.out.print( matrix[i][j]+" ");
            }
            System.out.println();
        }
        

        sc.close();
    }
}

/* 
 * Arrays in Java are passed by reference
 public class Main {
    public static void modifyArray(int[] arr) {
        arr[0] = 100; // Modifies the original array
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3};
        modifyArray(myArray);
        System.out.println(myArray[0]); // Outputs: 100
    }
}

* If you assign a new array to the parameter inside the method, it won't affect the original array:
public class Main {
    public static void reassignArray(int[] arr) {
        arr = new int[]{4, 5, 6}; // Reassigns to a new array
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3};
        reassignArray(myArray);
        System.out.println(myArray[0]); // Outputs: 1
    }
}
 
 */