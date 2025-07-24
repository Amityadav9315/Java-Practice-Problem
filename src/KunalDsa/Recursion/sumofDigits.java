package KunalDsa.Recursion;

import java.util.Scanner;

public class sumofDigits {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("Enter the number :  -1 to exit ");

            int n = sc.nextInt();
            if (n == -1) {
                System.out.println("Exit program");
                break;
            }


            sumofdigit(n);
        }

    }

    static  void sumofdigit(int n){
        int sum=0;
      while(n>0) {

          int rem = n % 10;
          sum = sum + rem;
          n = n / 10;
      }
        System.out.println(sum);


    }

}
