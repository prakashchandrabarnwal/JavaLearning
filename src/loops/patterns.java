package loops;

public class patterns {
    public static void main(String[] args){
        int li = 10;
        for(int i=1; i <= li ; i++){
            for(int j=1; j <= li; j++){
                if( i+j <= li){
                     System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            for(int k=2;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int p=1; p<=li; p++){
            for(int q=1;q<=li;q++){
                if(p < q ){
                     System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int y=1; y<=li-2 - p +1;y++){
                System.out.print("*");
            }
           System.out.println();
        }
    }
}
