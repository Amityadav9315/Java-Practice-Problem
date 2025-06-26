package KunalDsa;

import java.util.Scanner;

public class LinearSearch {

    static  void linearSearch(int[] arr,int n){
        int target=10;
        int count=0;
        for(int  i=0; i<n; i++){
            if(arr[i]==target){
                count++;
            }

        }
        if(count>=1){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element Not found");
        }


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        linearSearch(arr,n);
    }
}
