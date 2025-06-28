package KunalDsa.BinarySearch;

import java.util.Scanner;

public class FloorNumber {

    static  void floorNumber(int[]   nums,int n){
        int target=50;
        int floor=0;

        int start=0;

        int end=nums.length-1;

        while(start<=end){

            int mid=start+(end-start)/2;

            if(nums[mid]==target){

                System.out.println("Found at index:"+mid);
                break;

            }

            else if(target>nums[mid]){
                start=mid+1;
            }

            else if(target<nums[mid]){

                end=mid-1;
            }
            else if(target!=nums[mid]){
                System.out.println("Element not found");
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0; i<n; i++){

            nums[i]=sc.nextInt();
        }
        floorNumber(nums,n);
    }
}
