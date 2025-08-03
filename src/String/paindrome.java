package String;

import java.util.Scanner;

public class paindrome {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="aa";
        StringBuilder str1=new StringBuilder(str);
        str1.reverse();
        String p=str1.toString();
        if(str.equals(p)){
            System.out.println("Paildrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
