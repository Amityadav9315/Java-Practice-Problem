package KunalDsa;

import java.util.Scanner;

public class FibonacciSeries {


    static   void fibonacciSeries(int n){
        int a=0;
        int b=1;


        for(int i=0; i<2; i++){
             int c=a+b;
            System.out.println(c+" ");




        }



    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

    }
}
