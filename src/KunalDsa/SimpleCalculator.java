package KunalDsa;

import java.util.Scanner;

public class SimpleCalculator {

    static void simpleCalculator(char ch, int n1, int n2) {
        int result = 0;

        if (ch == '+' || ch == '-' || ch == '*' || ch == '%') {

            if (ch == '+') {
                result = n1 + n2;

            } else if (ch == '-') {
                result = n1 - n2;
            } else if (ch == '*') {
                result = n1 * n2;

            } else if (ch == '%') {
                result = n1 % n2;

            } else {
                System.out.println("Invalid operator");
            }


            System.out.println(result);


        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        while (true) {
            System.out.println("Enter the operator");
            ch = sc.next().charAt(0);
            if (ch == 'X' || ch == 'x') {
                System.out.println("Exit");
                break;
            }


            int n1 = sc.nextInt();
            int n2 = sc.nextInt();


            simpleCalculator(ch, n1, n2);


        }
    }
    }



