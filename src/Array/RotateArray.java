package Array;

import java.util.Scanner;

public class RotateArray {



    static void rotateArray(int[] arr,int n,int k){
        int[] arr1=new int[n];
         for(int i=0; i<k; i++){

           arr1[i]=arr[i];
           }
        for(int i=arr1.length; i<n; i++){
             arr1[i]=arr[1];
         }
         for(int x: arr1){
            System.out.println(x);
}
}   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
          rotateArray(arr,n,k);
    }
}
