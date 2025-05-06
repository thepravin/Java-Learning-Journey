public class insertionSort {

    public static void insertionSortFun(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int currVal = arr[i];
            int prevIdx = i - 1;

            // finding out the correction positon to insert
            while (prevIdx >= 0 && arr[prevIdx] > currVal) {
                arr[prevIdx + 1] = arr[prevIdx];
                prevIdx--;
            }

            // insertion
            arr[prevIdx + 1] = currVal;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 10, 2, 3, 5, 1, 9 };
        insertionSortFun(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
