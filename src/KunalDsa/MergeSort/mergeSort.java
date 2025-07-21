package KunalDsa.MergeSort;

import java.util.Scanner;

public class mergeSort {


    static  void Divide(int[] arr,int start,int end){
     if(start>=end){
         return;
     }
     int mid=start+(end-start)/2;
     Divide(arr,start,mid-1);
     Divide(arr,);

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

    }
}
