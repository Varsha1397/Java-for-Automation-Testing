package Thread;

public class ThreadbyClass {
    public static void main(String[] args) {

        WorkerThreadbyclass w1 = new WorkerThreadbyclass();
        w1.start();
        WorkerThreadbyclass w2 = new WorkerThreadbyclass();
        w2.start();


        //task 1 go from 1 to 5 - done by worker 1
        // task 1 go 1 to 100 - done by worker 2

//main thread work
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (Exception e) {

            }
        }
    }
}

    //Thread by clas
    class WorkerThreadbyclass extends Thread {

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
