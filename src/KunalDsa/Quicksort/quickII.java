package KunalDsa.Quicksort;

import java.util.Scanner;

public class quickII {

    static  int  partition(int[] arr,int low,int high){
        int pivote=arr[high];
        int i=low-1;
        for(int j=low; j<high; j++ ){
            if(arr[j]<pivote){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivote;
        arr[high]=temp;
        return i;
    }

    static  void quicksort(int[] arr,int  low,int high ){
        if(low<=high){

            int pidx=partition(arr,low,high);
            quicksort(arr,low,pidx-1);
            quicksort(arr,pidx+1,high);
        }

    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {

            arr[i]=sc.nextInt();

        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
