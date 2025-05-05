import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};

        int idx = Arrays.binarySearch(arr, 5);
        System.out.println(idx);

        Arrays.sort(arr); // use quick sort


        Arrays.fill(arr, 1);
        
        for(int i : arr){
            System.out.print(i+" ");
        }


    }
}
