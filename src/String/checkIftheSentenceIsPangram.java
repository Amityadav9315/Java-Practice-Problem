package String;

import java.util.Scanner;

public class checkIftheSentenceIsPangram {

    static void checkPangram(String str,int n){


        int count=0;
        for(int i=0; i<n; i++){

            if(str.charAt(i)>='a'||str.charAt(i)<='z'){
                count++;
            }

        }
        System.out.println(count);




    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="dvhfhlibdhbdthlbdjdbjfjtrytrgfhhjruityut";
        int n=str.length();
        checkPangram(str,n);
    }

}
