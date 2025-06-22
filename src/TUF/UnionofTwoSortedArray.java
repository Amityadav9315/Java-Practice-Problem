package TUF;

import java.util.Scanner;

public class UnionofTwoSortedArray {

    static void unionSortedArray(int[] arr1, int[] arr2, int n, int m) {
        // Maximum possible size = n + m
        int[] result = new int[n + m];
        int index = 0;

        // Add elements from arr1
        for (int i = 0; i < n; i++) {
            if (index == 0 || result[index - 1] != arr1[i]) {
                result[index++] = arr1[i];
            }
        }

        for (int i = 0; i < m; i++) {
            boolean isPresent = false;
            for (int j = 0; j < index; j++) {
                if (arr2[i] == result[j]) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) {
                result[index++] = arr2[i];
            }
        }

        // Print the result array
        for (int i = 0; i < index; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        unionSortedArray(arr1, arr2, n, m);
    }
}
