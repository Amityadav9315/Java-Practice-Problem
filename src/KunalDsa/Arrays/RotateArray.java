package KunalDsa.Arrays;

import java.util.Scanner;

public class RotateArray {

    static  void rotateArray(int[] arr,int n,int k){

        int[] arr1=new int[k];
        int[] result=new int[n];
        int index=0;
        for(int i=0; i<k; i++){
            arr1[i]=arr[i];
        }
        for(int i=0; i<n; i++)






    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

    }
}
