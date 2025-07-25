package KunalDsa.Recursion;

public class RecLinearSearch {

    public static void main(String[] args) {
        int[] arr={10,20,40,60};
        System.out.println(find(arr,60,0));

    }

    static  boolean find(int[] arr,int target,int index){
        if(index==arr.length){
            return false;

        }
        return  arr[index]==target|| find(arr,target,index);
    }
}
