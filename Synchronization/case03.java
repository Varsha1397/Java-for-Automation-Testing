package Synchronization;

public class case03 {


    public static void main(String[] args) throws Exception {

        Sync s1 = new Sync();  //same object for both thread
       // Sync s2 = new Sync();

        A ta = new A(s1, "A");
        ta.start();
        B tb = new B(s1, "B");
        tb.start();
    }

}
class A1 extends Thread {
    Sync s;

    public A1(Sync s, String tname) {
        super(tname);
        this.s = s;
    }

    public void run() {
        s.m1();
    }

}
class B1 extends Thread{

    Sync s;
    public B1(Sync s, String tname) {
        super(tname);
        this.s = s;
    }

    public void run() {
        s.m2();
    }

}


class Sync1 {
    synchronized void m1() {
        Thread th = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println(th.getName() + " - m1 - " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

    synchronized void m2() {
        Thread th = Thread.currentThread();
        for (int i = 101; i <= 105; i++) {
            System.out.println(th.getName() + " - m2 -" + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

