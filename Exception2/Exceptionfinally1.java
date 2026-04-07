package Exception2;

public class Exceptionfinally1 {
    public static void main(String[] args) {
        try {
            int a = 0; //1
         //   int a = 10;
            int x = 10 / a;
        }catch (Exception e) {
            System.out.println("Exit");
            System.exit(0);
        }finally {
            //write the code which you want 100% to be executed
            //database close
            //webdrive close. file close and IO close, scanner close
            System.out.println("i am final");
        }

    }
}
//here is finall block will not work bcz we used system exit here