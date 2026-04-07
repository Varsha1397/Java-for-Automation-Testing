package Static;

public class staticRC {
    public static void main(String[] args) {

        AB a = new AB();
    }

}
 class AB {
    static {
        System.out.println("I am a static Block");  // First execute static then object
    }
    AB(){
        System.out.println("default construction");


    }
 }