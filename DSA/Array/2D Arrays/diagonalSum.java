
public class diagonalSum {
    /*
     * Primary diagonal : row==col
     * Secondary diagonal : (row + col == n-1) ....[in n*n matrix]
     * 
     * In brut force approach...middle element get two times during sum.
     */

    public static int fun(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) { // i => row
            // Primary diagonal
            sum += matrix[i][i];

            // secondary diagonal
            if (i != matrix.length - i - 1) {
                sum += matrix[i][matrix.length - i - 1]; // as per above formula
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 }, { 7, 8, 9 } };

        System.out.println(fun(matrix));
    }
}
