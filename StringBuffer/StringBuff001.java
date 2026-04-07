package StringBuffer;

public class StringBuff001 {

    public static void main(String[] args) {

        //String Buffer is safer to use in multi-threaded environment
        // multithreaded means - only one at a time person will be use it

        StringBuffer sb1=new StringBuffer("TTA");
       StringBuffer sb2=new StringBuffer("TTA");
        System.out.println(sb1==sb2);
        System.out.println(sb1.equals((sb2)));// this concept not working - sb= equals for object - ref
        boolean b1= sb1.toString().contentEquals(sb2.toString()); // in buffer use this for equal
        boolean b2 = sb2.toString().equals(sb2.toString()); // string = char seq
        System.out.println("b1 : "+b1);
       System.out.println("b2   : "+b2);
        sb1.append("Varsha");
       System.out.println(sb1);

    }


}
