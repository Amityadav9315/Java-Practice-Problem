package KunalDsa.Recursion;

public class First1 {

    public static void main(String[] args) {
        method1();

    }

    static  void method1(){
        System.out.println("Hello World");
        method2();
    }
    static  void method2(){
        System.out.println("Hello world");
        method3();
    }
    static void method3(){
        System.out.println("Hello world");
        method4();
    }
    static  void method4(){
        System.out.println("Hello world");
        method5();
    }
    static  void method5(){
        System.out.println("Hello world");
    }
}
