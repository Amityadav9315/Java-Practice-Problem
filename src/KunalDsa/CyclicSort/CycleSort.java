package KunalDsa.CyclicSort;

import java.util.Scanner;

public class CycleSort {

    static  void cycleSort(int [] arr,int n){


        int value=0;
        for(int i=0; i<n; i++){
                int c=arr[i];

               int temp= arr[c-1];
                arr[c-1]=arr[i];
                arr[i]=temp;

            }
        for(int x:arr){
            System.out.print(x);
        }


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        cycleSort(arr,n);
    }
}
