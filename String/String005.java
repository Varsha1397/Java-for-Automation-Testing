package String;

public class String005 {

    public static void main(String[] args) {

        String str ="varshapalwalia";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(8));
        System.out.println(str.substring(5));

        System.out.println(str.substring(3,8));
        System.out.println(str.substring(3,9));
        System.out.println(str.indexOf("sha"));
        System.out.println(str.indexOf("i"));
        System.out.println(str.contains("var"));
        System.out.println(str.contains("pal"));
        System.out.println(str.contains("wal"));
    }
}
