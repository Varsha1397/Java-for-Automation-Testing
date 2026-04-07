package String;

public class String003 {
    public static void main(String[] args) {

        String str1 ="Hello";
        String str2 = "Guys";
        String str3 = "HelloGuys";

        String str4= str1.concat(str2);
        String str5 = "Hello".concat("Guys");  // 5 strings are there

        System.out.println(str3==str4);
        System.out.println(str3==str5);

        System.out.println(str4==str5);

        String str6=str1+str2;
        String str7="Hello" + "Guys"; //imp- literal+litreal
        System.out.println(str3==str6);

        System.out.println(str3==str7);


    }
}
