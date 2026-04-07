package single_inheritence;

public class Programming {

// Parent / base Class

    int version;
    String author;

    // DEfault construction
    //same name and not argument
    // no return type
    Programming() {
        System.out.println("I am  default const");
    }


    //Programmimg Construction
    Programming(int version1,String author1){
       //this
       this.author = author1;
       this.version = version1;

    }

    public String printInfo() {   //coming from the object class
        return "Programming{" +
                "version=" + version +
                ", author='" + author + '\'' +
                '}';
    }




}
