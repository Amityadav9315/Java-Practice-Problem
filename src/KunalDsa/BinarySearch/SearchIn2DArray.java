package KunalDsa.BinarySearch;

import java.util.Scanner;

public class SearchIn2DArray {


    static void searchIn2DArray(int arr[][],int n,int m){


        int target=50;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j]==target){
                    System.out.println("Found at index:"+i+","+j);
                }
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
        searchIn2DArray(arr,n,m);
    }
}
