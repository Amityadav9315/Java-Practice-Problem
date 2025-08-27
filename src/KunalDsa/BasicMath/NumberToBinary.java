package KunalDsa.BasicMath;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberToBinary {
    static void numberTobInary(int n) {
        List<Integer> obj = new ArrayList<>();
        if (n == 0) {
            System.out.println("Binary : 0");
        }
            while (n>0) {
                obj.add(n % 2);
                n = n / 2;
            }
            for (int i = obj.size() - 1; i >= 0; i--) {
                System.out.print(obj.get(i)+" ");
            }
        System.out.println();
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to conert binary (-1 to stop)");

        System.out.println("Enter the number to convert in binary");

        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                System.out.println("Programme stopped");
                break;
            }
            vhhvbgkbjk

            numberTobInary(n);


        }
    }
    }


