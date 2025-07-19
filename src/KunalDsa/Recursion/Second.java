package KunalDsa.Recursion;

public class Second {

    public static void main(String[] args) {

        method1(1);

    }

    static  void method1(int n){

        if(n>5){
            return;

        }
        System.out.println(n);
        method1(n+1);




    }
}
