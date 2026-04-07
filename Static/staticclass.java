package Static;

public class staticclass {
   static {
       System.out.println(" I am static block");
   }

  static int a =10;

   static void print(){
       System.out.println("I am static Method");
   }
  static class MyNestedClass{
       public void display(){
           System.out.println("I am Nested Static Class");
       }

  }


}
