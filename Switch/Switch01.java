package Switch;

public class Switch01 {
    public static void main(String[] args) {
        int a=45;
        final int X=20;// final variable , Constant

        //X=30; Error: Cannot assign a value to final variable X
       switch (a) {
           case 10:
               System.out.println("Ten");
               break;            // IF NO  BREAK THERE SO ALL WILL BE EXECUTED
            case X:
               System.out.println("Twenty");
               break;
           case 'A':
               System.out.println("Char - A");
           case 10+20+15:
               System.out.println("Constant expr");
               break;
           default:
               System.out.println("Default");
       }
        System.out.println("END");


        }
    }

