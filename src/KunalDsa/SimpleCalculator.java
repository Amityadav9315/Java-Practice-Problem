package KunalDsa;

import java.util.Scanner;

public class SimpleCalculator {

    static  void simpleCalculator(int ch,int n1,int n2,int result){

        if(ch=='+'){
            result=n1+n2;


        }
        else if(ch=='-'){
            result=n1-n2;
        }
        else if (ch=='*') {
            result=n1*n2;

        } else if (ch=='%') {
            result=n1%n2;

        }


        {

        }


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the operator");
        char ch=sc.nextLine().charAt(0);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int result=sc.nextInt();

    }
}
