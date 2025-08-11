package KunalDsa.String;

public class reverseString {
    public static void main(String[] args) {
        String str="Amit Yadav";
        StringBuilder ans=new StringBuilder();
        for(int i=str.length()-1; i>=0; i--){
            ans.append(str.charAt(i));

        }
        System.out.println(ans);

    }

    }

