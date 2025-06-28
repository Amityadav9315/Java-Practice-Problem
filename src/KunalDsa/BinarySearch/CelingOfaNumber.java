package KunalDsa.BinarySearch;

import java.util.Scanner;

public class CelingOfaNumber {

    static  void   cealingofaNumber(int[] arr,int n){

        int celing=-1;
        int start=0;
        int end=arr.length-1;
        int target=13;


        while(start<=end){

            int mid=start+(end-start)/2;

            if(target==arr[mid]){
              celing=arr[mid];

                break;
            }

            else if(target>arr[mid]){
                start=mid+1;

            }
            else if(target<arr[mid]){
                celing=arr[mid];
                end=mid-1;
            }
        }

        if(celing==-1){

            System.out.println("Celing value not found(all value is les then celing value)");

        }
        else{

            System.out.println("Celing value is"+celing);
        }






    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []  arr=new int[n];
        for(int i=0; i<n; i++) {

            arr[i]=sc.nextInt();
        }
        cealingofaNumber(arr,n);
    }
}
