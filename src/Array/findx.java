package Array;

import java.util.Scanner;

public class findx {

    static  void findX(String[] arr,int n){
        for(int i=0; i<n; i++){
            if(arr[i].equals("x")){
                System.out.println("Element found");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.next();
        }
        findX(arr,n);

    }
}
