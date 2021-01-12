package array;

public class reverse {
    public static void main(String[] args){

        int[] list = {1,2,3,4,5,6,7,8,9,10};
        int temp;
        for (int i = 0 ; i < (list.length-1)/2 ; i++){

            list[i] = list[list.length - 1 - i] ^ list[i];
            list[list.length-1-i] = list[list.length - 1 - i] ^ list[i];
            list[i] = list[list.length - 1 - i] ^ list[i];

        }

        for (int x: list) {
            System.out.printf("%d ",x);
        }

    }
}
