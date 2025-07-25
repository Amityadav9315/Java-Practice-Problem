package Days100;

import java.util.Scanner;

public class Fibnocci {

    static  int  fibonacci(int n) {


        return fibonacci(n-1)+fibonacci(n-2);






    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        fibonacci(3);

    }
}
