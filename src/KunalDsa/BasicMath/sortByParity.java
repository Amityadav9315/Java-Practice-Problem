package KunalDsa.BasicMath;

import java.util.Scanner;

public class sortByParity {
    static  void sortByParity(int [] arr,int n){

        int [] result=new int[n];
        int index=0;
        for(int i=0; i<n; i++){
            if(arr[i]%2==0){
                result[index++]=arr[i];
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<result.length; j++){
                if(arr[i]!=result[j]){
                    result[index++]=arr[i];
                }
            }
        }
        for(int x: result){
            System.out.print(x+" ");
        }


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        sortByParity(arr,n);
    }
}
