package KunalDsa.BinarySearch;

import java.lang.classfile.attribute.SyntheticAttribute;
import java.util.Scanner;

public class orderAgoinistic {

    static  void orderAgoinsitic(int[] arr,int n){

        int start=0;
        int end=arr.length;
        int  target=100;

        for(int i=0; i<n; i++){
            if(arr[i]<=arr[i+1]){
                System.out.println("Ascending Order");
            }
            else{
                System.out.println("Descending Order");
            }
        }

        while(start<=end){

            int mid=start+(end-start)/2;
            for(int i=0; i<n; i++){

                if(target==mid){
                    System.out.println("Element found at index :"+mid);
                    break;
                }

               else  if(mid>target){
                    end=mid-1;
                }
                else if(mid<target){
                    start=mid+1;
                }


            }
        }


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]  arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
    }
}
