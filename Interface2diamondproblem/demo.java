package Interface2diamondproblem;

public class demo {
    public static void main(String[] args) {
        Cool main = new Cool();
        main.printSomething();
    }
}

interface InterfaceA{
   default void printSomething() {
       System.out.println("I am inside A Interface ");
   }
}
 interface InterfaceB {
        default void printSomething() {System.out.println("I am inside B interface ");
    }

 }
 class Cool implements InterfaceA, InterfaceB{
//diamond problem solved here
     @Override
     public void printSomething() {
         InterfaceA.super.printSomething();
         InterfaceB.super.printSomething();
     }
 }








