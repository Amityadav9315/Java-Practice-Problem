package KunalDsa;

import java.util.Scanner;

public class SimpleCalculator {

    static  void simpleCalculator(int ch,int n1,int n2) {
        int result = 0;
        while (true) {
            if(ch=='+'||ch=='-'||ch=='*'||ch=='%') {

                if (ch == '+') {
                    result = n1 + n2;

                } else if (ch == '-') {
                    result = n1 - n2;
                } else if (ch == '*') {
                    result = n1 * n2;

                } else if (ch == '%') {
                    result = n1 % n2;

                }
            }
            else if(ch=='X'){
                break;
            }

             else {
                System.out.println("Invalid operator");
            }


            System.out.println(result);


        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the operator");
        char ch=sc.nextLine().charAt(0);
        int n1=sc.nextInt();
        int n2=sc.nextInt();


        simpleCalculator(ch,n1,n2);

    }
}
