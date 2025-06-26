package KunalDsa;

import java.util.Scanner;

public class PascalTriangle {

    static void pascalTriangle(int n) {
        int[][] ans = new int[n][];

        for (int i = 0; i < n; i++) {
            ans[i] = new int[i + 1];
            ans[i][0] = ans[i][i] = 1;

            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }

        // Print the triangle
        for (int[] row : ans) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pascalTriangle(n);
    }
}
