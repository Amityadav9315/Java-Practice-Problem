package KunalDsa.BinarySearch;

import java.util.Scanner;

public class FloorNumber {

    static  void floorNumber(int[]   nums,int n){
        int target=50;
        int floor=-1;

        int start=0;

        int end=nums.length-1;

        while(start<=end){

            int mid=start+(end-start)/2;

            if(nums[mid]==target){
                floor=nums[mid];


                break;

            }

            else if(target>nums[mid]){
                floor=nums[mid];
                start=mid+1;
            }

            else if(target<nums[mid]){

                end=mid-1;
            }

        }

        if(floor==-1){
            System.out.println("No floor value found all number are greater then fillor value");
        }
        else{
            System.out.println("Floor value found at:"+floor);
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
