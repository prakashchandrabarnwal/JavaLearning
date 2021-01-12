package array;

public class add2matrix {
    public static void main(String[] args){
        int [][] m1 = {{3,5,9},{7,6,2},{4,3,5}};
        int [][] m2 = {{1,5,2},{6,8,4},{3,9,7}};
        int [][] m3 = new int[3][3];

        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1[i].length; j++){
                m3[i][j] = m1[i][j] + m2[i][j];
            }
        }

        for(int[] x: m3){
            for(int y:x){
                System.out.printf("%d ",y);
            }
            System.out.println();
        }
    }
}
