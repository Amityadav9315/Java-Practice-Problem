package KunalDsa;

import java.util.Scanner;

public class Switchstatement {


    static void switchStatement(String fruit){
        switch (fruit){
            case "Mango":
                System.out.println("king");
                break;
            case "Banana":
                System.out.println("Queen");
                break;
            case "Papaya":
                System.out.println("Legend");
                break;
            case "Orange":
                System.out.println("Nagpur");
                break;
            default:
                System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String  fruit=in.next();
        switchStatement(fruit);
    }
}




