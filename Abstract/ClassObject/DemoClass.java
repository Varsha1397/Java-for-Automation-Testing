package ClassObject;

public class DemoClass {
    public static void main(String[] args) {

        //class is a blue-print and object is a real thing of a class
        //including attributes and methods
        //attributes - person name , height , gender
        //methods - he can walk , sleep


Person p1 =new Person();
p1.name = "Vishal";
p1.age = 29;
p1.gender = "Male";


p1.run();
p1.sleep();
p1.talk();







    }
}



  class Person{
      //Attributes
      String name;
      int age;
      String gender;
      double height;
      long phone;
      String address;


      // Methods
      void run() {
      }

      void sleep() {
             //write the code
      }

      void talk() {

      }


}
