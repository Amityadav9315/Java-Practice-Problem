package KunalDsa.CyclicSort;

import java.util.Scanner;

public class FirstMissingPositive {

    static  void firstMissing(int[] arr,int n){

        int i=0;
        int correct=arr[i]-1;
        while(i<n){
            if(arr[i]>0&&arr[i]<=n&&arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct-1];
                arr[correct-1]=temp;
            }
            else{
                i++;
            }
        }
        int ans=0;
        for(i=0; i<n; i++){

            if(arr[i]!=i+1){
                ans=i+1;



            }
        }
        System.out.println(ans);


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        firstMissing(arr,n);
    }
}
