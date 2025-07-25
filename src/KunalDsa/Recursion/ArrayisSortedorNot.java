package KunalDsa.Recursion;

import java.util.Scanner;

public class ArrayisSortedorNot {

    static  void arraySorted(int[] arr,int n){

        int count=1;
        for(int i=0; i<n-1; i++){
            if(arr[i]<arr[i+1]){
                count++;
            }
        }
        if(count==n) {
            System.out.println("Array is sorted");
        }
        else {
            System.out.println("Array is not sorted");
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        arraySorted(arr,n);

    }
}
