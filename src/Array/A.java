
public class A {
    public static void main(String[] args){
    int arr[]={8,0,5,6,7};
    int max=0;
    int sec=0;
    for(int i=0;i<5;i++){
        if(arr[i]>max){
            sec=max;
            max=arr[i];

        } else if (arr[i]<max)
        {
         sec=arr[i];

        }
    }
    System.out.println(sec);

    }



}
