package KunalDsa;

import java.util.Scanner;

public class RotatedSortedArray {

    static  void rotatedsortedArray(){

    }

    static  void binarySearch(int[] arr,int n,int target){

        int start=0;
        int end=arr.length;
        while(start<=end){

            int mid=start+(end-start)/2;
            if(arr[mid]>target){

            }
            else if(arr[mid]<target){


            }
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int  target=50;
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
    }
}
