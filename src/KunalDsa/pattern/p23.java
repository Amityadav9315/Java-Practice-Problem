package KunalDsa.pattern;

public class p23 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            int val=i%2;
            for(int j=1; j<=i; j++){
                System.out.print(val+" ");
                val=1-val;

            }
            System.out.println();


        }
    }
}
