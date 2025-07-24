package KunalDsa.Recursion;

import java.util.Scanner;

public class No1to5 {

//    static  void number(int n){
//        if(n==0){
//            return;
//        }
//        System.out.println(n);
//        number(n-1);
//    }
    static  void numberRev(int n){
        if(n==0){
            return;
        }

        numberRev(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        numberRev(9);

    }
}
