package KunalDsa.Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAllduplicate {

    static  void  findDuplicate(int[] arr,int n){


        List<Integer>  obj=new ArrayList<>();
        for(int i=0; i<n; i++){
            int count=0;
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    count++;



                }


            }
            if(count>0) {
                obj.add(arr[i]);
            }
        }

            System.out.print(obj+" ");




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
