package Array;

import java.util.Scanner;

public class LeadersinAnArray {

    static void leadersinAnArray(int[] arr, int n) {
        int maxFromRight = arr[n - 1];
        System.out.print(maxFromRight + " ");

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        leadersinAnArray(arr, n);
    }
}
