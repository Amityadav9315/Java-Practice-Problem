package KunalDsa.BasicMath;

import java.util.Scanner;

public class HCF {
    static  void hcf(int n,int m){
        int max=0;

        if(n>m) {
            for (int i = 1; i < n; i++) {
                if (n % i == 0 && m % i == 0) {
                    if(i>max){
                        max=i;
                    }
                }
            }
        }
            else{
            for (int i = 1; i < m; i++) {
                if (n % i == 0 && m % i == 0) {
                    if(i>max){
                        max=i;
                    }
                }
            }





        }
        System.out.println(max);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        hcf(n,m);


    }
}
