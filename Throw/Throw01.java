package Throw;

public class Throw01 {

    // Throw - When specific condition meet - raise an exception

    public static void main(String[] args) {
try {
    int r = divide(10, 0);
    System.out.println(r);
}catch (Exception e){
  //  e.printStackTrace();
    System.out.println(e.getMessage());
}


    }

    static int divide(int a , int b){
        if (b == 0){
            throw new ArithmeticException("b zero is not possible");
        }
        int result = a/b;
        return result;
    }


}
//it is with in the function