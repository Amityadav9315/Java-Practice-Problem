package KunalDsa.BinarySearch;

import java.util.Scanner;

public class rowColMatrix {
    static  void  rowColumnMatrix(int[][] arr,int target){

        int r=0;
        int c=arr.length-1;
        while(r< arr.length&&c>=0){
            if(arr[r][c]==target){
                System.out.println(r+","+c);
                break;

            }
            else if(arr[r][c]<target){
                r++;
            }
            else {
                c--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr={{10,20,30},
                     { 25,27,29},
                      {28,30,35}};
        rowColumnMatrix(arr,35);

    }

}
