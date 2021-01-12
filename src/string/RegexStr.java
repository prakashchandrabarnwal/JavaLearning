package string;

import java.util.Scanner;

public class RegexStr {
    public static void main(String []a){
       // String str1 = "a";
       // System.out.println(str1.matches("."));
            // "." single
       // String str2 = "a";
       // System.out.println(str2.matches("[abc]"));
        // [abc] single anything
        // String str3 = "d";
        // System.out.println(str3.matches("[^abc]"));
        // [a-z0-9]

        // a|b either a or b

        // \d  single digit
        // \D  no digit
        // \s  Space
        // \S  not space
        // \w  alphabets and digits
        // \W  not alphabet or not digit

        // *        0 or more
        // +        1 or more
        // ?        0 or more
        // {X}      X times
        // {X,Y}    between X and Y

        // get username and check gmail
        Scanner  scanner= new Scanner(System.in);
        String str = scanner.nextLine();
        int idxOfAt = str.lastIndexOf('@');
        System.out.printf("user name : %s", str.substring(0,idxOfAt));
        int indexOfDot = str.lastIndexOf(".");
        System.out.println();
        System.out.println("is gmail ? "+str.substring(idxOfAt+1,indexOfDot).equals("gmail"));

        System.out.println("String*@a0c23".replaceAll("[\\W]",""));



    }
}
