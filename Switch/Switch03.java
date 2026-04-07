package Switch;

public class Switch03 {
    public static void main(String[] args) {

        int a=45;
// only int short  byte long with convert in int are allowed
        short sh=2222;
        switch(sh){}

        long a11=30;
        switch ((int)a11){} //long allowed when convert into int

        long c=11;

        float f=30.0F;
        switch ((int)f){}
        System.out.println("print only c value");








    }

}
