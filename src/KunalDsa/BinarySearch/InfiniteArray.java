package KunalDsa.BinarySearch;

import java.util.Scanner;

public class InfiniteArray {

    static  void binarySearch(int[] arr,int target,int start,int end){

        while(start<=end){

            int mid=start+(end-start)/2;

            if(target==arr[mid]){
                System.out.println();


            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;

            }
        }
    }

    static  void ans(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }




    }

    public static void main(String[] args) {



    }
}
