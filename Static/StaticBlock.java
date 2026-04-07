package Static;

import org.w3c.dom.ls.LSOutput;

public class StaticBlock {

    //static variable
    static int a = 10;
    static int b; // 0  // static variable

    //static block
    static {
        System.out.println("Static block initialized"); //static block
        b = a * 4;
        //user case - if you want to do something first  before  any code
        // open webdriver = new ChromeDriver();
        //FileinputStream  f = new FileInputStream();
    }

    public static void main(String[] args) {  //value automatic execute
        System.out.println("from main");
        System.out.println("value of a : " + a);
        System.out.println("value of b :" + b);
    }
}
//static variable
//static blocks
//static method