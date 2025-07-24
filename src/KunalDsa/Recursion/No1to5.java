package KunalDsa.Recursion;

import java.util.Scanner;

public class No1to5 {

    static  void number(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        number(n-1);
    }

    public static void main(String[] args) {
        number(9);

    }
}
