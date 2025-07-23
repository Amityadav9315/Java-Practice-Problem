package KunalDsa.BasicMath;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SquareRoot {

    static  void squareroot(int n){

        int start=0;
        int target=50;
        int end=target-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid*mid==target){
                System.out.println(mid);
                break;
            }
            else if(mid*mid>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        squareroot(n);
    }
}
