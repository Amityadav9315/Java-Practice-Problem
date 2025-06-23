package KunalDsa;

import java.util.Scanner;

public class countNoofDigitOccurance {


    static  void countNoofDigitOccurance(int countno,int n){

        int rem=0;
        int count=0;
        while(n>0){
            rem=n%10;
            n=n/10;
            if(rem==countno){
                count++;
            }
        }
        if(count==0){
            System.out.println("Not found");
        }
        else{
            System.out.println(count);
        }





    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int countno=sc.nextInt();
        int n=sc.nextInt();
        countNoofDigitOccurance(countno,n);
    }
}
