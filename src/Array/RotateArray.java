package Array;

import java.util.Scanner;

public class RotateArray {



    static void rotateArray(int[] arr,int n,int k){
        int[] arr1=new int[n];
        int index=0;
        for(int i=k-1;i<n;i++){
            arr1[index++]=arr[i];


       }









    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }


    }
}
