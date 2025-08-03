package String;

public class Solution {


    static void checkOnesSegment(String s) {
        int n = s.length();
        StringBuilder str=new StringBuilder();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            str.append(ch);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 1 && str.charAt(i+1) == 1) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }

        }


    }



public static void main(String[] args) {
            String s="110";
            checkOnesSegment(s);


}
}
