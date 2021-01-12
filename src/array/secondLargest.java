package array;

public class secondLargest {
    public static void main(String[] args){
        int[] list = {4,6,8,2};
        int largest , secLargest ;
        largest = secLargest = list[0];
        for (int x : list) {
            if(largest < x){
                secLargest = largest;
                largest = x;
            }else if(secLargest < x){
                secLargest = x;
            }
        }
        System.out.printf("second largest : %d",secLargest);
    }
}
