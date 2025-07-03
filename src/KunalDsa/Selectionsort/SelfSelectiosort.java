package KunalDsa.Selectionsort;

import java.util.Scanner;

public class SelfSelectiosort {

    static  void selfSelection(int [] arr,int n){

        int minIndex=0;

        for(int i=0; i<n-1; i++){

            for(int j=i+1; j<n; j++){

                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        for(int x: arr){

            System.out.print(x+ " ");
        }


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){

            arr[i]=sc.nextInt();
        }
        selfSelection(arr,n);
    }
}
