package Generics;

public class Generics001 {

//use T for generic
    //tell in diamond operator
    public static <T> void temp(T a)
    {
        System.out.println(a);

    }


    public static void main(String[] args) {
        temp(23);
        temp(23.3);
        temp('a');
        temp("vaRSHA");

    }

}
