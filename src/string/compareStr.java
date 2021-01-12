package string;

public class compareStr {
    public static void main(String []args){
        String str1 = "Java";
        String str2 = "Java";
        System.out.println(str1==str2);

        String str3 = new String("Java");
        System.out.println(str3==str1);
    }
}
