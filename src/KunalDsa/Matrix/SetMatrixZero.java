package KunalDsa.Matrix;

import java.util.Scanner;

public class SetMatrixZero {

    static  void setMatrixZero(int [][]  arr,int n,int m){
            int c=0;
        for(int i=0; i<n; i++) {
            for (int j = 0; j < m; j++) {

                if (arr[i][j] == 0) {

                     c = i + j;
                    break;
                }
            }
        }

                  for(int i=0; i<n; i++){
                      for(int j=0; j<m; j++){
                       if(i+j!=c&&i+j!=0&&i+j!=c*2){
                        arr[i][j]=0;
                    }
                }
            }
                  for(int[] x:arr){
                      for(int value:x){
                          System.out.print(value+" ");
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
        setMatrixZero(arr,n,m);
    }
}
