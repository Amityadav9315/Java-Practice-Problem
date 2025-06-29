package KunalDsa.BinarySearch;

import java.util.Scanner;

public class SmallestLetterGreaterthanTarget {



    static  void samallestLetter(char[] arr,int n) {


        int start = 0;
        char target = 'a';
        int end = arr.length - 1;
        int result=0;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {

                result=arr[mid+1];
            } else if (target > arr[mid]) {


                start = mid + 1;


            }else if(target<arr[mid]){
                result=arr[mid];
                end=mid-1;
            }

        }
        System.out.println(result);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[]  arr=new char[n];
        for(int i=0; i<n; i++){

            arr[i]=sc.next().charAt(i);
        }

        samallestLetter(arr,n);



    }

}
