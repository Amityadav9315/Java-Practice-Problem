package TUF;

import java.util.Scanner;

public class UnionofTwoSortedArray {

    static void unionogSortedArray(int[] arr1,int[] arr2,int n,int m){
        int index=0;
        int[] result=new  int[index++];

        for(int i=0; i<n; i++){
            result[index++]=arr1[i];
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                result[index++]=arr1[i];
               
            }

        }



    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0; i<n; i++){
            arr1[i]=sc.nextInt();
        }

        int[] arr2=new int[m];
        for(int i=0; i<n; i++){
            arr2[i]=sc.nextInt();
        }

    }
}
