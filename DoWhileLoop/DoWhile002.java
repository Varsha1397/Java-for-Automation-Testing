package DoWhileLoop;

public class DoWhile002 {
    public static void main(String[] args) {
        int i =0;

        do {
            System.out.println("Value of i:  " +i); //i=0
           i--;
            //break;
        }while (i>-5); // this condition will not check due to break

    }
}