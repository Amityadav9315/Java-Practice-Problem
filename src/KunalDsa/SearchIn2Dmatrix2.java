package KunalDsa;

import java.util.Scanner;

public class SearchIn2Dmatrix2 {


    static void searchin2DMatrix(int[][] arr,int n,int m) {
        int count=0;
        int target=50;

        for(int i=0; i<n; i++){

            if(arr[n][m]==target){
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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                arr[n][m] = sc.nextInt();
            }

        }
        searchin2DMatrix(arr,n,m);
    }
}
