public class fastExponentiation {
    /*
     * O(logn)
     */
    public static int fun(int n, int pow) {
        int ans = 1;

        while (pow > 0) {
            if ((pow & 1) != 0) { // check LSB
                ans = ans * n;
            }
            n = n * n;
            pow = pow >> 1;
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(fun(3, 5));
    }
}
