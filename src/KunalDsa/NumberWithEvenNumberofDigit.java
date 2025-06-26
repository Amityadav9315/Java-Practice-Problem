package KunalDsa;

import java.util.Scanner;

public class NumberWithEvenNumberofDigit {

    static  void  evenNoofDigit(int[]  arr,int n){

        int count=0;
        int count1=0;
        int rem=0;
        int c=0;

        for(int i=0; i<n; i++){
            c=arr[i];


            while(c>0) {

                rem = c % 10;
                c=c/10;
                count++;


            }
            if(count%2==0){
                count1++;
            }
            c=0;
            count=0;



        }
        System.out.println(count1);



    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[]  arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();

        }
        evenNoofDigit(arr,n);
    }
}
