package KunalDsa.Arrays;

import java.util.Scanner;

public class kthLargest {

    static  void kthlargest(int[] arr,int k,int n){

        int max=0;
        int maxIndex=0;


        for(int j=1; j<k; j++){

        max=0;
        for(int i=0; i<n; i++){

            if(arr[i]>max){
                max=arr[i];
            }
        }






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
