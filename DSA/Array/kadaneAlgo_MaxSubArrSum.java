
public class kadaneAlgo_MaxSubArrSum {
    /*
     * Algo. said that if sum is -ve...then convert it into zero.
     * 
     * Note : if all numbers are -ve...then retun largest -ve number directly.
     *       like {-1,-3,-4} algo. give ans = 0 but correct ans is -1.
     */

    public static int maxSubarraySumFun(int arr[]) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 1; i < n; i++) {
            currSum += arr[i];
            if (currSum < 0)
                currSum = 0;

            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;

    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        int sum = maxSubarraySumFun(arr);

        System.out.println(sum);
    }
}
