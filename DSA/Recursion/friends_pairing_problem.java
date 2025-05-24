
/* 
 * Friends Pairing Problem
Given n friends, each one can remain single or can be paired up with some other
friend. Each friend can be paired only once. Find out the total number of ways in
which friends can remain single or can be paired up.
 */
public class friends_pairing_problem {

    public static int findWay(int n) {
        // base case
        if (n == 1 || n == 2)
            return n;

        // ---Choices

        // single
        int fp1 = findWay(n - 1);

        // pair
        int fp2 = findWay(n - 2);
        int finalPair = (n - 1) * fp2;

        int totalWay = fp1 + finalPair;
        return totalWay;
    }

    public static void main(String[] args) {
        int n = 3;
        int ans = findWay(n);

        System.out.println(ans);
    }
}
