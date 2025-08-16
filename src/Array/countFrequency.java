package Array;

import java.util.Scanner;

public class countFrequency {
    static  void frquency(int[] arr,int n){

        int[] result=new int[n];
        boolean visited;
        for(int i=0; i<n-1; i++){
            int count=1;
            for(int j=i+1; j<n; j++ ){
                if(arr[i]==arr[j]){
                    count++;
                    visited=true;
                }

            }
            if(arr[i]!=arr[i+1]){
                result[i]=count;
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i]!=arr[i+1]){
                System.out.println(arr[i]);
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
    }
}
