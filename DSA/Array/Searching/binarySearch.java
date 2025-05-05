
/* 
 * Alwasy require sorted array.
 */

public class binarySearch {

    public static int bs(int arr[], int key) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = (s + e) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] > key)
                e = mid - 1;
            else
                s = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9,10};
        int search = 11;
        int idx = bs(arr,search);
        System.out.println(idx);
    }
}
