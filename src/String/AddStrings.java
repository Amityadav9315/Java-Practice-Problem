package String;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

import static java.time.temporal.TemporalAdjusters.next;

public class AddStrings {


    static void addString(int[] arr1,int[] arr2,int n,int m){
        int count1=0;
        int count2=0;

        for(int i=0; i<n; i++){

        }
        for(int i=0; i<m; i++){
            if(arr2[i]>count2){
                count2=arr2[i];

            }
        }
        System.out.println(count1);
        System.out.println(count2);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int[] arr1=new int[n];
        int[] arr2=new int[m];
        for(int i=0; i<n; i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0; i<m; i++){
            arr2[i]=sc.nextInt();
        }
        addString(arr1,arr2,n,m);

    }
}
