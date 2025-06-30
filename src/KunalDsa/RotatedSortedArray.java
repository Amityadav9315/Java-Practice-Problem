package KunalDsa;

import java.util.Scanner;

public class RotatedSortedArray {


    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findPivote(arr));


    }


    static int search(int[] nums, int target) {

        int pivote=findPivote(nums);
        if(pivote==-1){
            return  binarySearch(nums,target,0, nums.length-1);
        }


    }


    static  int  binarySearch(int[] arr,int target,int start,int end){

        while(start<=end){

            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }
    static  int findPivote(int[] arr){
        int start=0;
        int end=arr.length;
        while(start<=end){

            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;

            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else {
                start=mid-1;
            }


        }
        return -1;
    }


        }





