package leetcode;

import java.util.Scanner;

public class LeetcodeString {


    static  void validpalindrome(String str){

        StringBuilder str1=new StringBuilder();
        StringBuilder str2=new StringBuilder();
        for(int i=0; i< str.length(); i++){
            char ch=str.charAt(i);
            str1.append(ch);
        }
        for(int i=str.length()-1; i>=0; i--){
            char ch=str.charAt(i);
            str2.append(ch);
        }
        if(str1.toString().equals(str2.toString())){
            System.out.println("Valid palindrome");
        }
        else{
            System.out.println("Invalid palindrome");
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
         validpalindrome(str);
    }
}
