package KunalDsa.BinarySearch;

import java.lang.classfile.attribute.SyntheticAttribute;
import java.util.Scanner;

public class orderAgoinistic {

    static  void orderAgoinsitic(int[] arr,int n){

        int start=0;
        int end=arr.length-1;
        int  target=100;

            if(arr[0]<=arr[1]){
                System.out.println("Ascending Order");
            }
            else{
                System.out.println("Descending Order");
            }


        while(start<=end){

            int mid=start+(end-start)/2;


                if(target==arr[mid]){
                    System.out.println("Element found at index :"+mid);
                    break;
                }

               else  if(arr[mid]>target){
                    end=mid-1;
                }
                else if(arr[mid]<target){
                    start=mid+1;
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

        orderAgoinsitic(arr,n);

        }
}
