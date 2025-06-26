package KunalDsa;

import java.util.Scanner;

public class Searchin2Darray {

    static  void serachin2DArray(int[][] arr){
        int target=10;

        for(int r=0; r<arr.length; r++){
            for(int c=0; c<arr[r].length; c++){
                if(arr[r][c]==target){
                    System.out.println("Present");
                }

            }
        }


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] [] arr={
                {10,20,30},
                {37,54,34},
                {23,54,65}
        };
        serachin2DArray(arr);
    }
}
