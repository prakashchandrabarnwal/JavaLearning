package array;

public class rotate {
    public static void main(String[] args){
        int[] list = {1,2,3,4,5};

        for (int x:list) {
            System.out.printf("%d ",x);
        }
        System.out.println();
        int firstEl = list[0];
       for(int i = 1; i < list.length ; i++){
           list[i-1] = list[i];
       }
       list[list.length-1] = firstEl;

        for (int x:list) {
            System.out.printf("%d ",x);
        }

        System.out.println();

        int last = list[list.length - 1];

      for(int z = list.length-2 ; z >=0 ; z--){
          list[z+1] = list[z];
      }

        list[0] = last;

        for (int x:list) {
            System.out.printf("%d ",x);
        }


    }
}
