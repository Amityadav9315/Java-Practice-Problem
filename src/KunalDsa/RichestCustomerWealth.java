package KunalDsa;

import java.util.Scanner;

public class RichestCustomerWealth {


    static  void richestCustomerWealth(int[] [] arr,int n,int m){
        int sum=0;
        int max=0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){

                sum=sum+arr[i][j];
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int[][]  arr=new int[n][m];
        for(int i=0; i<n; i++){

            for(int j=0; j<m; j++){

                arr[i][j]=sc.nextInt();
            }
        }

    }
}
