package KunalDsa.BubbleSort;

import java.util.Scanner;

public class BubbleSort {

    static  void bubblesort(int[] arr,int n){{

        int temp=0;
        boolean visited;

        for(int i=0; i<n; i++){
            visited=false;
            for(int j=1; j<n-i; j++){
                if(arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    visited=true;

                }
            }
            if(!visited){
                break;
            }
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        bubblesort(arr,n);
    }
}
