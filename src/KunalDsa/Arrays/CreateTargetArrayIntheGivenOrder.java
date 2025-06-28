package KunalDsa.Arrays;

import java.util.Scanner;

public class CreateTargetArrayIntheGivenOrder {

    static  void   targetArray(int[]  nums,int[] index,int n){


        int[]  result=new int[n];

        for(int i=0; i<n; i++){
            if(result[index[i]]==0){
            result[index[i]]=nums[i];
        }
            else{
                for(int j=i; j<n-1; j++){
                    result[index[i]]=index[i+1];
                    result[index[i]]=nums[i];

                }

                }
            }

        for(int x:result){
            System.out.print(x+" ");



        }


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]  nums=new int[n];
        int [] index=new int[n];
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }

        for(int i=0; i<n; i++){
            index[i]=sc.nextInt();
        }
        targetArray(nums,index,n);
    }
}
