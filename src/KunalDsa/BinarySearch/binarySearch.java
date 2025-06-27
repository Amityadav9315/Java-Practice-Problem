package KunalDsa.BinarySearch;

import java.util.Scanner;

public class binarySearch {


    static  void binarySearch(int[] arr ,int n){

        int start=0;
        int target=50;
        int end= arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                System.out.println("Element found at index :"+mid);
                break;
                csdjkksvlf

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
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0; i<n; i++){

            arr[i]=sc.nextInt();
        }

        binarySearch(arr,n);
    }
}
