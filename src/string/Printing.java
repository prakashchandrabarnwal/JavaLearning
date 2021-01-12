package string;

public class Printing {
    public static void main(String []args){
        int i = 76;
        char c = 'C';
        float f = 10.3f;
        System.out.println(i+f);
        System.out.printf("hello %o %d",i,i);
        System.out.println();
        System.out.printf("%2$d %1$d",5,1);
    }
}
