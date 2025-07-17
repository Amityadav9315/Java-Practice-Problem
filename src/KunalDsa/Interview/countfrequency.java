package KunalDsa.Interview;

import java.util.Scanner;

public class countfrequency {

    static  void countfrquency(int[]  arr,int n){

        int[] arr1=new int[n];

        int visited=-1;
        for(int i=0; i<n; i++){
            int count=1;
            for(int j=i+1; j<n; i++){

                if(arr[i]==arr[j]){
                    count++;

                }
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []  arr=new int[n];
        for(int i=0; i<n; i++){

            arr[i]=sc.nextInt();
        }
    }


}
