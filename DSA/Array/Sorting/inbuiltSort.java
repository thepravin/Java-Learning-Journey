
import java.util.Arrays;
import java.util.Collections;

public class inbuiltSort {    

    public static void main(String[] args) {
        int arr[] = { 5, 10, 2, 3, 5, 1, 9 };
        // Arrays.sort(arr); //*  ( n logn)

        // Arrays.sort(arr,0,3); //* (array, statIdx, endIdx)

        /*
         * -------- decendign order sort ----------
         */

        Integer arr2[]={ 5, 10, 2, 3, 5, 1, 9 };
        // Arrays.sort(arr2,Collections.reverseOrder());
        Arrays.sort(arr2,0,3,Collections.reverseOrder());


        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }
}
