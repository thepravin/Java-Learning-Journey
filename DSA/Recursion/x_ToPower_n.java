
public class x_ToPower_n {

    public static int power(int a, int n) {
        // base case
        if (n == 0)
            return 1;

        int halfPower = power(a, n / 2);
        int ans = halfPower * halfPower;

        if ((n & 1) != 0) {// odd
            ans *= a;
        }

        return ans;

    }

    public static void main(String[] args) {
        int a = 2;
        int n = 20;

        System.out.println(power(a, n));
    }
}
