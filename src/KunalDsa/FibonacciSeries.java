package KunalDsa;

import java.util.Scanner;

public class FibonacciSeries {
    static   void fibonacciSeries(int n){
        int a=0;
        int b=1;
        if(n<=2){
            System.out.println(n);
        }
        for(int i=0; i<n; i++){
             int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;

        }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        fibonacciSeries(n);

    }
}
