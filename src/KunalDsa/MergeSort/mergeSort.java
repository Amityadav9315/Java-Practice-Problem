package KunalDsa.MergeSort;

import java.util.Scanner;

public class mergeSort {

    static void Conquer(int[] arr,int start,int mid,int end){
      int[] merged=new int[end-start+1];
      int idx1=start;
      int idx2=mid+1;
      int index=0;
      while(idx1<=mid&&idx2<=end){
          if(arr[idx1]>=arr[idx2]){
            merged[index++]=arr[idx2++];
          }
          else {
              merged[index++]=arr[idx1++];
          }
      }
      while(idx1<=mid){
          merged[index++]=arr[idx1++];
      }
      while (idx2<=end){
          merged[index++]=arr[idx2++];
      }
        for(int i=0,j=start; i<merged.length; i++,j++){
            arr[j]=merged[i];
        }
    }
    static  void Divide(int[] arr,int start,int end){
     if(start>=end){
         return;
     }
     int mid=start+(end-start)/2;
     Divide(arr,start,mid);
     Divide(arr,mid+1,end);
     Conquer(arr,start,mid,end);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        Divide(arr,0,n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
