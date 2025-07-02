package KunalDsa;

import java.util.Scanner;

public class CellsWithOddvalueinMatrix {


    static  void  cellwithOdd(){


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){

                arr[i][j]=sc.nextInt();
            }
        }
        int[][] indeces=new int[2][2];
        for(int i=0; i<2; i++) {
            for (int j = 0; j < 2; j++) {
                indeces[i][j] = sc.nextInt();
            }
        }
    }
}
