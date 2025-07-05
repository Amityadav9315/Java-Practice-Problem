package KunalDsa;

import java.util.Scanner;

public class TransposeofMatrix {

    static void tranposeMatrix(int[][] arr,int n) {


        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){

                arr[i][j]=arr[j][i];

            }
        }

        for(int[] x:arr){
            for(int value:x)
            System.out.print(value+" ");
        }




    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=sc.nextInt();

            }

        }
        tranposeMatrix(arr,n);
    }
}
