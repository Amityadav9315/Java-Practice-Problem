package KunalDsa.BasicMath;

import java.util.Scanner;

public class findSingleno {

    static  void findNumber(int [] arr,int n){
        int unique=0;

        for(int x: arr){
            unique=unique^x;
        }
        System.out.println(unique);

    }
    public static void main(String[] args) {



        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();

        }
        findNumber(arr,n);
    }
}
