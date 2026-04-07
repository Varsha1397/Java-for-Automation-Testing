package Exception2;

public class Exception001Fixed {

    public static void main(String[] args) {
        extracted2();
        System.out.println("extracted Execute2");
    }

    private static void extracted2() {
        extracted1();
        System.out.println("extracted Execute1");
    }

    private static void extracted1() {
        extracted();
        System.out.println("extracted Execute");
    }

    private static void extracted() {
        try {
            String name = null;
            name.length();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//always add catch and try where is the main cause - at end not in stating
//thogh code has problem using try and catch got output
//jvm will not trminate prog
//will handle by myself
//parent should be the last one
