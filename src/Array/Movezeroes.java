package Array;

import java.util.Scanner;

public class Movezeroes {


    static void moveZeroes(int[] arr,int n){

        int[]  result=new int[n];
        int index=0;

        for(int i=0; i<n; i++){

            if(arr[i]!=0){
                result[index++]=arr[i];
            }


        }
        for(int x: result){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        moveZeroes(arr,n);
    }
}
fd.kfd