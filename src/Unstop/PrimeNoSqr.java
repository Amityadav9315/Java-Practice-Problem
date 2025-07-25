package Unstop;

import java.util.Scanner;

public class PrimeNoSqr {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int num = 2;
            int result = 0;

            while (n > 0) {
                if (isPrime(num)) {
                    result = num * num;
                    n--;
                }
                num++;
            }

            System.out.println(result);
        }

        public static boolean isPrime(int x) {
            if (x < 2) return false;
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) return false;
            }
            return true;
        }
    }


