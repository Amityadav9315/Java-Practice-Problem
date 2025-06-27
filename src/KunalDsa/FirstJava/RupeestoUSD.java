package KunalDsa.FirstJava;

import KunalDsa.SimpleCalculator;

import java.util.Scanner;

public class RupeestoUSD {


    static void rupeestoUSD(int n){

        System.out.println("Rupees" +n+"="+n*0.0117+"USD");


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        rupeestoUSD(n);
    }
}
