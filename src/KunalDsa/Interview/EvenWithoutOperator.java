package KunalDsa.Interview;

import java.util.Scanner;

public class EvenWithoutOperator {


    static  void  evenOrODD(int n){

        int i=1;
        if((n&i)==0){
            System.out.println("Even number"+n);
        }
        else{
            System.out.println("Odd number"+n);

        }



    }

    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);
        int n=sc.nextInt();

        evenOrODD(n);
    }
}
