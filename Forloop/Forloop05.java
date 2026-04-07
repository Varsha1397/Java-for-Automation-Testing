package Forloop;

public class Forloop05 {
    public static void main(String[] args) {

        //Can Break be incude in the For loops

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;// exit the loop when equals to 5
            }
            System.out.println(i);

          //  System.out.println("END");
        }
    }
}

