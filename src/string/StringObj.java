package string;

public class StringObj {
    public static void main(String[]args){
        char c[] = {'h','e','l','l','o'};
        String str1 = new String(c);
        System.out.println(str1);

        byte b[] = {65,66,67,68};
        String str2 = new String(b);
        System.out.println(str2);
    }

}
