package StringBuilder;

public class StringBuilder001 {

    public static void main(String[] args) {


        //string bulider are same as string buffer only difference is buffer uses its own content equal and string use as its equals
// no care about threading - using builder mostly times
        StringBuilder sb1=new StringBuilder("TTA");
        StringBuilder sb2=new StringBuilder("TTA");
        System.out.println(sb1==sb2);

        System.out.println(sb1.equals((sb2)));// this concept not working - sb= equals for object - ref
        boolean b1= sb1.toString().contentEquals(sb2.toString()); // in buffer use this for equal

        boolean b2 = sb2.toString().equals(sb2.toString()); // string = char seq

        System.out.println("b1 : "+b1);

        System.out.println("b2   : "+b2);

        sb1.append("Varsha"); //append means adding
        sb1.reverse();
        sb1.append("omg");
        System.out.println(sb1);










    }
}