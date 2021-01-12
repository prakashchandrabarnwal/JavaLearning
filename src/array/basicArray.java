package array;

public class basicArray {
    public static void main(String[] args){
        int[] a={1,2,3,7,4,5,6};
        int sum=0;
        for (int el:a){
            sum+=el;
        }


        System.out.println(sum);

        int el = 5;

        for(int i = 0 ; i<a.length ; i++){
            if(a[i]==el){
                System.out.printf("found at %d",i);
                // return;
            }
        }

        // findMax

        int max = a[0];
        for(int x:a){
            if(x>max){
                max = x;
            }
        }
        System.out.println();
        System.out.printf("max : %d",max);
    }
}
