package single_inheritence;

public class java extends Programming{

//extends - keywors is used to inherit all the things from the prograamming
// author, version
    //sub class / child

String newFeature;

java() {
    System.out.println("i am default child");

}

java(int version, String author, String newFeature){
    //super is used for the call the para or default const of parent class
    super(version,author);


    //this is used for the current class
    this.newFeature = newFeature;

}
   void printDetails(){
    super.printInfo();
       System.out.println("New Feature is " + this.newFeature);


   }

}
