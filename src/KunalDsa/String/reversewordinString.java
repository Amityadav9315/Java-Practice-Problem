package KunalDsa.String;

public class reversewordinString {

    public static void main(String[] args) {
        String str="Amit Yadav";
        String[] words=str.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word: words){
            result.append(new StringBuilder(word).reverse().toString());
            result.append(" ");

        }
        System.out.println(result.toString().trim());
    }



}
