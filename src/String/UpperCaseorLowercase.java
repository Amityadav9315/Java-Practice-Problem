package String;

import java.util.Scanner;

public class UpperCaseorLowercase {

    static void upperorLowercase(char ch){
        if(ch>='a'  && ch<='z'){
            System.out.println("lower case");
        }
        else{
            System.out.println("upper case");
        }



    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.nextLine().charAt(0);

        upperorLowercase(ch);



    }
}
