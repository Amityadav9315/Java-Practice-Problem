package KunalDsa.Interview;

import java.util.Scanner;

public class FindAllduplicate {

    static  void  findDuplicate(int[] arr,int n){

        int count=0;
        int index=0;
        int[] arr2=new int[index];
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    count++;



                }
            }
            if(count>0) {
                arr[index++] = arr[i];
            }
        }
        for(int x:arr){
            System.out.print(x+" ");
        }



    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();

        }
        findDuplicate(arr,n);
    }
}
