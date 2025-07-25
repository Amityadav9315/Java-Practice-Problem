package KunalDsa.Recursion;

import java.util.Scanner;

public class Palindrome {
    static  void palindrome(int n){
        int num=n;
        int rev=0;

        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;

        }
        if(rev==num){
            System.out.println("Pailidrome number");
        }
        else{
            System.out.println("Not palindrome number");
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        palindrome(n);

    }
}
