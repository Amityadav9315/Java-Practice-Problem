package KunalDsa.Recursion;

public class Binarysearch {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,55,66,78};
        int target=3;
        System.out.println(binartSerch(arr,target,0,arr.length-1));


    }
    static  int  binartSerch(int[] arr,int target,int start,int end){

        if(start>end){
            return  -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){

            return mid;
        }
        if(arr[mid]>target){
           return  binartSerch(arr,target,start, mid-1);
        }
        return  binartSerch(arr,target,mid+1,end);


    }
}
