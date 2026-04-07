package String;

public class String002 {

    public static void main(String[] args) {
        String name = "The Testing Academy"; //sp
        String name1 = "The Testing Academy"; //sp (swimpool)
          String name2 = new String( "The Testing Aacademy"); //Heap area

        System.out.println(name == name1);
        System.out.println(name.equals(name1));

        System.out.println(name.equalsIgnoreCase(name1));

        System.out.println(name == name2);

        System.out.println(name.equals((name2)));

    }
}
