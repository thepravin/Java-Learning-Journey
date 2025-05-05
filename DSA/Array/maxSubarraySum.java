
import java.util.*;

public class maxSubarraySum {
    /*
     * Using prefix sum approach
     */

    public static int maxSubarraySumFun(int arr[]) {
        int n = arr.length;
        int prefixSum[] = new int[n];
        int maxSum = Integer.MIN_VALUE;

        prefixSum[0] = arr[0];

        // calculate the prefix sum
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        // calculate max sum
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                maxSum = Math.max(maxSum, (prefixSum[j] - prefixSum[i]));
            }
        }

        return maxSum;

    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        int sum = maxSubarraySumFun(arr);

        System.out.println(sum);
    }
}
