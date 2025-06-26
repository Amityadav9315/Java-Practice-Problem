package KunalDsa;

import java.util.Scanner;

public class LinearSearchString {

    static  void stringSearch(String str){
        int n=str.length();
        char target='a';
        int count=0;
        if(str.length()==0){
            System.out.println("Not found");
        }

        for(int i=0; i<n; i++){
            if(target==str.charAt(i)){
             count++;

            }




        }
        if(count>=1){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }





    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        stringSearch(str);
    }
}
