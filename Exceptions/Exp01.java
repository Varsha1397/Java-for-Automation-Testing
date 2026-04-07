package Exceptions;

public class Exp01 {
    public static void main(String[] args) {
        String sh = args[0];// *10* //step 1 - array index
        // 123  - Integer
        int x = Integer.parseInt(sh); //step 2  - number  format exception

        int d10 = 10/x; //step 3
        System.out.println("Your output is - " +d10);



    }

}

//jvm will be initiaized
//will create and start a main thread
//Main thread will collect the Command line argument
//now execution happens - Exp01.main(Str)
// if problem - jvm will terminate the main method
//it will create an object of the exception and give it to the user
//Execution will stop

//** give abc at argument got error number format - line 9 terminate
// give nothing in arguments got array index out of bound exception - line 5 error
// give 0 got arithmwtic excep
// excep gven by jvm
//all unchecked at runtime