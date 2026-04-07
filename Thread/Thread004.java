package Thread;

public class Thread004 {
//thread run by implement
    public static void main(String[] args) {

        Runnable w1 = new WorkerThread004();
        Thread t1 = new Thread(w1);
        t1.start();

        Runnable w2 = new WorkerThread004();
        Thread t2 = new Thread(w2);
        t2.start();


    }
}
//Thread by runnable
class WorkerThread004 implements Runnable{



    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (Exception e) {

            }
        }
    }
}

