public class swap {

    public static void main(String[] args){
          int x = 7, y = 5;
          x= x^y;
          y= x^y;
          x= x^y;
          System.out.println(x +"" + y);
    }
}
