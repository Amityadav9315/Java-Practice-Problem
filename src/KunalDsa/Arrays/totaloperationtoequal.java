package KunalDsa.Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.abs;

public class totaloperationtoequal {

    static  int  totalOperation(int[] arr,int n){
        int middle=arr[n/2];
        int totop=0;
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            totop=totop+Math.abs(arr[i]-middle);

        }
        return totop;


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(totalOperation(arr,n));
    }


}
