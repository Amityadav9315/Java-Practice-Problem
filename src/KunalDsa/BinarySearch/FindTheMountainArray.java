package KunalDsa.BinarySearch;

import java.util.Scanner;

public class FindTheMountainArray {

    static  void findtheMountainArray(int[]  arr,int n){

        int target=3;
        int count=0;
        for(int i=0; i<n; i++){

            if(arr[i]==target){
                count=i;
                break;
                svfksf


            }
        }
        System.out.println("Value is at Index:"+count);


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]  arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();

        }
        findtheMountainArray(arr,n);
    }
}
