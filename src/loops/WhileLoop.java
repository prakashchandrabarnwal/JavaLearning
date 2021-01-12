package loops;

public class WhileLoop {
    public static void main(String [] args){
        int i = 1;
        while(i < 100){
            System.out.println(i);
            i = i*2;
        }
        do {
            System.out.println(i);
            i=i*2;
        }while (i < 100);

        byte b = 0;
        while(true){
            System.out.println(b);
            b++;
        }
    }
}
