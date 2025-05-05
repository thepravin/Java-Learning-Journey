
public class trappingRainWater {

    public static int fun(int arr[]) {
        int n = arr.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        leftMax[0] = arr[0];
        rightMax[n - 1] = arr[n - 1];

        // left max arr
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }

        // right max arr
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }

        int total = 0;
        for (int i = 0; i < n; i++) {
            total += (Math.min(leftMax[i], rightMax[i]) - arr[i]);
        }

        return total;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int totalWaterTrapped = fun(height);

        System.out.println(totalWaterTrapped);
    }
}
