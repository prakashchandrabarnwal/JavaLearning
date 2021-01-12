package array;

public class twoD {
    public static void main(String [] args){

        int[][] twoA = { {1,2,3},{2,3} };

        for (int[] x: twoA) {
            for(int y : x){
                System.out.println(y);
            }
        }

    }
}
