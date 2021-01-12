package methods;

public class mtd {
    int max(int x, int y){
        return x > y ? x : y;
    }
    public static void main(String []args){
        mtd m = new mtd();
        int result = m.max(1,2);
        System.out.println(result);
    }
}
