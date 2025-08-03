package String;

import java.util.Scanner;

public class reverseWordInsentence {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        String ans="";
        StringBuilder str1=new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                str1.append(ch);
            }
            else{
                str1.reverse();
                ans=ans+str1;
                ans=ans+" ";
                str1=new StringBuilder();
            }
        }
        str1.reverse();
        ans+=str1;
        System.out.println(ans);

    }
}
