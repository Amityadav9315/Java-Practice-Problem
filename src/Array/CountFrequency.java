package Array;

import java.util.Scanner;

public class CountFrequency {

    static void countFrequency(int[] arr, int n) {
        int[] arr1 = new int[n];

        int visited = -1;
        for (int i = 0; i < n; i++) {

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr1[j] = visited;

                }
            }
            if (arr1[i] != visited) {
                arr1[i] = count;

            }

    }
            for (int i = 0; i < n; i++) {
                if (arr1[i] != visited) {
                    System.out.println(arr[i] +" "+ arr1[i]);
                }
                System.out.println();
            }
        }



            public static void main (String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                countFrequency(arr,n);
            }
        }


