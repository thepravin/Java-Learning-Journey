public class countingSort {

    public static void fun(int[] arr) {
        int n = arr.length;

        // find largest element
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
            largest = Math.max(largest, arr[i]);

        // count frq of each element
        int frq[] = new int[largest + 1]; // larget is 10 but idx are 0 to 9 can't soter 10 so, i.e
        for (int i = 0; i < n; i++) {
            frq[arr[i]]++;
        }

        // count sort
        int idx = 0;
        for (int i = 0; i < frq.length; i++) {
            while (frq[i] > 0) {
                arr[idx] = i;
                idx++;
                frq[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 10, 2, 3, 5, 1, 9 };
        fun(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
