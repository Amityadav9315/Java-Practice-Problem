package KunalDsa.CyclicSort;

import java.util.Scanner;

public class kunal {

    static void kunalSort(int[] arr, int n) {
        int i = 0;
        while (i < n) {
            int correct = arr[i] - 1;
            if (arr[i] >= 1 && arr[i] <= n && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        for( i=0; i<n; i++){
            if((i+1)!=arr[i]){
                System.out.print(i+" ");
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

        kunalSort(arr, n);
    }
}
