package KunalDsa.Interview;

import java.util.Scanner;

public class FindAllduplicate {

    static  void  findDuplicate(int[] arr,int n){

        int count=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; i++){
                if(arr[i]==arr[j]){


                }
            }
        }



    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();

        }
    }
}
