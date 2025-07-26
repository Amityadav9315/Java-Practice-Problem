package KunalDsa.Recursion.String;

import java.util.Scanner;

public class removeA {

    static  void removeA(String str){
        StringBuilder result=new StringBuilder();

        int n=str.length();

        for(int i=0; i<n; i++){
            if(str.charAt(i)!='a'){
                result.append(str.charAt(i));
            }
        }
        System.out.println("The ans is "+ result);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        removeA(str);
    }
}
