class Solution {

    /*
    In-place transformation using modular arithmetic.
    
    Encode two values in one integer using:
    combined = old + n * new
    
    Decode using:
    new = combined / n    
    old = combined % n
     */

    public int[] buildArray(int[] nums) {
        int n = nums.length;

        // First Pass: Encode both current and future values into each element
        for (int i = 0; i < n; i++) {
            int currentValue = nums[i];
            int futureValue = nums[currentValue] % n; // value at index nums[i], mod n to get original before it's changed

            nums[i] = currentValue + n * futureValue; // encode both values into one
        }

        // Second Pass: Decode to get only the future value (i.e., nums[nums[i]])
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] / n; 
        }

        return nums;
    }
}