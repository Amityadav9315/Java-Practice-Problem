package KunalDsa.Interview;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Totaloperationtoallzeroorone {

    static  void  allSamre(int[] arr,int n){

        int count1=0;
        int count2=0;
        int index=0;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                count1++;
            }
            else{
                count2++;

            }
        }
        int count3=0;
        if(count1>count2){
            for(int i=0; i<n; i++){
                if(arr[i]==1){
                    arr[i]=0;
                    count3++;
                }
            }
        }
        else{
            for(int i=0; i<n; i++){
                if(arr[i]==0){
                    arr[i]=1;
                    count3++;
                }
            }
        }
        for(int x: arr){
            System.out.print(x+" ");
        }
        System.out.println("Number of operation::"+count3);


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);

        int n=sc.nextInt();
        int[]  arr=new int[n];
        for(int i=0; i<n; i++){

            arr[i]=sc.nextInt();


        }
        allSamre(arr,n);
    }
}
