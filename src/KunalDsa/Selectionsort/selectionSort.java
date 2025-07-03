package KunalDsa.Selectionsort;

import java.util.Scanner;

public class selectionSort {


    static  void selectionSorts(int[] arr,int n){




    }
    static  void max(int[] arr,int n){
        int max=0;
        for(int i=0; i<n; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }

    }

    static  void swap(int[] arr,int n){

        int temp=0;
        int first=0;
        int last=arr.length-1;
        temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;

    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

    }
}
