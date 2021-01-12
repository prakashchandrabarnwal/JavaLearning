package array;

public class Arrays {
    public static void main(String []args){
        int a[]={1,2,3,4};
        int[] b=new int[]{3,4,6};

        for(int i=0;i<b.length;i++){
            System.out.println(b[i]++);
        }

        for(int x:b) {
            System.out.println(x++);
        }

        for(int x:b) {
            System.out.println(x);
        }

        System.out.println(b);
    }
}
