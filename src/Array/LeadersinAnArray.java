package Array;

import java.util.Scanner;

public class LeadersinAnArray {


    static  void   leadersinAnArray(int[]  arr,int n) {

        int[] arr1 = new int[n];
        int index=0;

        for (int i = n - 1; i > 0; i++) {
            for (int j = n - 2; j > 0; j++) {

                if (arr[i] > arr[j]){
                    arr1[index++]=arr[i];

                }


            }


        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);
        int n=sc.nextInt();
        int[]   arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();

        }
    }
}
