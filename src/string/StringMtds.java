package string;

public class StringMtds {
    public static void main(String[]a){
        String str = " JaVa ";
        System.out.println(str.length());
        String lower = str.toLowerCase();
        System.out.println(lower);
        String upper = str.toUpperCase();
        System.out.println(upper);
        String trim = str.trim();
        System.out.println(trim);

        String part = str.substring(1,2);
        System.out.println(part);

        String replace = "Jaea".replace("e","v");
        System.out.println(replace);

        System.out.println("charat".charAt(0));

        System.out.println("Java".startsWith("Ja"));
    }

}
