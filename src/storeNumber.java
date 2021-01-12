public class storeNumber {

    public static void main(String [] args){
        byte a=9,b=2;
        byte c;
        c= (byte) (a<<4);
        c= (byte) (c|b);
        System.out.println(c&0b00001111);
    }
}
