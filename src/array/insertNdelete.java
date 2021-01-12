package array;

class insert {

    public static void main(String[] args){

        int[] list = new int[10];
        list[0] = 1;
        list[1] = 2;
        list[2] = 1;
        list[3] = 4;
        list[4] = 5;

        for (int x:list) {
            System.out.printf("%d ",x);
        }

        System.out.println();

        int at = 2;
        int value = 3;
        int temp = 0;

        for(int i = at ; i < list.length-1 ; i++){
            if( i == at){
                 temp = list[i];
                 list[i] = value;
            }else if( i > at){
                list[i] = temp ^ list[i];
                temp = list[i] ^ temp;
                list[i] = list[i] ^ temp;
            }
        }

        for (int x:list) {
            System.out.printf("%d ",x);
        }

    }
}

class Delete {
    public static void main(String[] args){
        int[] list = new int[10];
        list[0] = 1;
        list[1] = 2;
        list[2] = 2;
        list[3] = 3;
        list[4] = 4;

        for (int x:list) {
            System.out.printf("%d ",x);
        }

        System.out.println();

        int index = 2;

        for(int i = index ; i < list.length-1; i++){

                list[i] = list[i+1];

        }

        for (int x:list) {
            System.out.printf("%d ",x);
        }

    }
}