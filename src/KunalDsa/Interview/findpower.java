package KunalDsa.Interview;

import java.util.Scanner;

public class findpower {

    static int  findPower(int x,int m){

        int mult=1;
        for(int i=0; i<m; i++){
            mult=mult*x;
        }
        return mult;



    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();
        int m=sc.nextInt();

        System.out.println(findPower(x,m));
    }
}
