
public class selectionSort {

    public static void selectionSortFun(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) { // after all iterations last element allread get sorted
            int minPos = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j; // update min value idx
                }
            }
            // * swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 10, 2, 3, 5, 1, 9 };
        selectionSortFun(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
