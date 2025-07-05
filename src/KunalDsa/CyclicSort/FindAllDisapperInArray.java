package KunalDsa.CyclicSort;

import java.util.Arrays;
import java.util.Scanner;

public class FindAllDisapperInArray {

    static  void  findAllDisappear(int[] arr,int n){

        Arrays.sort(arr);
        boolean visited=false;
        int sum=0;

        for(int i=0; i<n; i++){

            sum=sum+arr[i];
            visited=true;



        }


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
    }
}
