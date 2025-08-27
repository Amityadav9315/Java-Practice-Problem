package Array;

import java.util.Scanner;

public class countFrequency {
    static  void frquency(int[] arr,int n){

        int[] result=new int[n];
        int visited=-1;
        for(int i=0; i<n; i++){
            int count=1;
            for(int j=i+1; j<n; j++ ){
                if(arr[i]==arr[j]){
                    count++;
                    result[j]=visited;

                }

            }
            if(result[i]!=visited){
                result[i]=count;
            }
        }
        for(int i=0; i<n; i++){
            if(result[i]!=visited){
                System.out.print(arr[i]+" "+result[i]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();


            }
        frquency(arr,n);
    }
}
