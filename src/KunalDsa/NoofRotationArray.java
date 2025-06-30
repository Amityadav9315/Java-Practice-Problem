package KunalDsa;

import java.util.Scanner;

public class NoofRotationArray {

    static  void noofRotationofArray(int[] arr,int n){

        int count =0;
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                count=i;

            }
        }
        System.out.println(n-1-count);



    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();

        }

        noofRotationofArray(arr,n);
    }
}
