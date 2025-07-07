package KunalDsa.Arrays;

import java.util.Scanner;

public class FindDuplicate {

    static  void findDuplicate(int[] arr,int n){

        int result=0;
        boolean visited=false;
        for(int i=0; i<n-1; i++){
            for(int j=1; j<n; j++){
             if(arr[i]==arr[j]&&i!=j){
                result=arr[i];
                 visited=true;
                break;


             }

            }
            if(visited==true){
                break;
            }
        }
        System.out.println(result);


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        findDuplicate(arr,n);
    }
}
