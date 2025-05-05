
public class bubbleSort {

    public static void bubbleSortFun(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 10, 2, 3, 5, 1, 9 };
        bubbleSortFun(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
