
public class searchInSortedArray {

    /*
     * O(n^2)
     * public static int[] fun(int matrix[][], int key) {
     * int r = matrix.length;
     * int c = matrix[0].length;
     * int ans[] = new int[2];
     * 
     * for (int i = 0; i < r; i++) {
     * for (int j = 0; j < c; j++) {
     * if (matrix[i][j] == key) {
     * ans[0] = i;
     * ans[1] = j;
     * break;
     * }
     * }
     * }
     * 
     * return ans;
     * }
     */

    // * O(n + m) */
    public static int[] fun(int matrix[][], int key) {
        int r = 0;
        int c = matrix[0].length - 1;
        int ans[] = new int[2];

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == key) {
                ans[0] = r;
                ans[1] = c;
                return ans;
            }

            else if (matrix[r][c] < key)
                r++;
            else
                c--;
        }

        ans[0] = -1;
        ans[1] = -1;
        return ans; // not present...
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 }, { 7, 8, 9 } };

        int key = 5;

        int ans[] = fun(matrix, key);

        System.out.print(ans[0] + " " + ans[1]);

    }
}
