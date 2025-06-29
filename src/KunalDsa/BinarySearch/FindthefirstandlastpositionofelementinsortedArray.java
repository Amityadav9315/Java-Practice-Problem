package KunalDsa.BinarySearch;

import java.util.Scanner;

public class FindthefirstandlastpositionofelementinsortedArray {

    static  void  firstandLast(int[]  arr,int n){

        int[]  result={-1,-1};

        int start=0;
        int target=8;
        int end=arr.length-1;
        while(start<=end){

            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                result[0]=mid;
                break;
            }
            if(arr[mid]==target){
                result[1]=mid;
                break;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
        }



    }

    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);
        int n=sc.nextInt();
        int[]  arr=new int[n];
        for(int i=0; i>n; i++){
            arr[i]=sc.nextInt();
        }
    }
}
