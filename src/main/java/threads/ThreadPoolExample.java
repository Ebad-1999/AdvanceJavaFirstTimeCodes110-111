package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {

        //creating single thread for one task
//        Thread thread = new Thread(new Task());
//        thread.start();
//        System.out.println("Thread name: "+Thread.currentThread().getName());
        //suppose we have 10 tasks
        /*
        for(int i=0; i<1000; i++){
            Thread thread = new Thread(new Task());
            thread.start();
        }
        System.out.println("Thread name: "+Thread.currentThread().getName());

         */
        //how you can get availableProcessors number
        int coreCount = Runtime.getRuntime().availableProcessors();
        System.out.println("availableProcessors: "+coreCount);
        ExecutorService service = Executors.newFixedThreadPool(coreCount);
        for(int i = 0; i<100; i++){
            service.execute(new Task());//assigning 100 tasks to my 4 pool of threads
        }
        System.out.println("Thread name: "+Thread.currentThread().getName());
        service.shutdown(); //to stop the pool of threads



    }
}
class Task implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread name: "+ Thread.currentThread().getName());
    }
}
