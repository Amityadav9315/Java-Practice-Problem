package KunalDsa;

public class MatrixobtainedbyRotation {
    static void findRotation(int[][] mat, int[][] target) {

        int n = mat.length;
        int m = mat[0].length;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j || (i + j) == n - 1) {
                    sum1 = sum1 + mat[i][j];
                }
            }
        }
        int c = target.length;
        int d = target[0].length;
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++) {
                if (i == j || (i + j) == n - 1) {
                    sum2 = sum2 + target[i][j];
                }
            }
        }
        if (sum1 == sum2) {
            System.out.println("true");

        } else {
            System.out.println("false");


        }
    }

    public static void main(String[] args) {
        int[][] mat = {
                {0, 0},
                {1, 1}
        };
        int[][] target = {
                {0, 1},
                {1, 0}
        };
        findRotation(mat, target);
    }
}



