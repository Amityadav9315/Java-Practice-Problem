package KunalDsa.BasicMath;
import java.util.Scanner;
public class MagicNumber {
    static  void magicNumber(int n){
        int m=0;
        int ans=0;
        int base=5;
        while(n>0){
            int last=n&1;
            n= n>>1;
            ans+=ans+last*base;
            base=base*5;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        magicNumber(n);
    }
}
