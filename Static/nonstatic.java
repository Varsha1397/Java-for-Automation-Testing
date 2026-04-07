package Static;

public class nonstatic {

static void m1(){
    int a =20;
    System.out.println("m1");
    System.out.println("m1 - " +a);

}

     //non static method
    void m2 (){
        System.out.println("M2");
    }

    public static void main(String[] args) {
        nonstatic.m1();

        nonstatic nonstatic = new nonstatic(); // create an object form non static
         nonstatic.m2();
         //m2(); -not possible


    }

}


