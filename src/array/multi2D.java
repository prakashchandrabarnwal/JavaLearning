package array;

public class multi2D {
    public static void main(String[] args){
        int[][] m1 = {{3,5,9},{7,6,2},{4,3,5}};
        int[][] m2 = {{1,0,0},{0,1,0},{0,0,1}};

        int[][] m3 = new int[3][3];

        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1[i].length; j++){
                int sum = 0;
                for(int k = 0; k < 3; k++){
                   sum += m1[i][k] * m2[k][j];
                }
                m3[i][j] = sum;
            }
        }

        for(int[]x:m3 ){
            for(int y:x){
                System.out.printf("%d ",y);
            }
            System.out.println();
        }
    }
}
