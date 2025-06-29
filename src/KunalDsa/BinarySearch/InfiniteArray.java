package KunalDsa.BinarySearch;

import java.util.Scanner;

public class InfiniteArray {

    static  void infiniteArray(int[] arr,int target,int start,int end){

        while(start<=end){

            int mid=start+(end-start)/2;

            if(target==arr[mid]){


            }
            else if(target>mid){
                start=mid+1;
            }
        }




    }

    public static void main(String[] args) {

    }
}
