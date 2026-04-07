package Exception2;

public class Exception001 {
    public static void main(String[] args) {
        extracted2(); }

    private static void extracted2() {
        extracted1();
    }

    private static void extracted1() {
        extracted();
    }

    private static void extracted() {
        String name = null;
        name.length();

    }

}
 //logs give the line by line where is the exact problem is