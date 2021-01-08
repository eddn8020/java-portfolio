// This program contains multiple threads. Executing the join() method ensures that th1
// completes its task first and then th2 and th3 are executed.
public class ThreadExample extends Thread {

    public static void main(String args[]) {
        ThreadExample th1 = new ThreadExample();
        ThreadExample th2 = new ThreadExample();
        ThreadExample th3 = new ThreadExample();


        th1.start();
        try {
            th1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        th2.start();
        th3.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                // set the thread to sleep for 250 miliseconds
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
