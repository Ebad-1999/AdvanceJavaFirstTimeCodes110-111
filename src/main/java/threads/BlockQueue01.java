package threads;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockQueue01 {
    static public int counter =0;
    public static void main(String[] args) {

        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        Producer01 producer01 = new Producer01(queue);
        Thread producerThread = new Thread(producer01);
        producerThread.start();
        Consumer01 consumer01 = new Consumer01(queue);
        Thread consumerThread = new Thread(consumer01);
        consumerThread.start();

    }
}
class Producer01 implements Runnable{
    private ArrayBlockingQueue<Integer> queue;
    public Producer01(ArrayBlockingQueue<Integer> queue){
        this.queue = queue;
    }
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
                queue.put(BlockQueue01.counter);
                BlockQueue01.counter++;
                System.out.println("Counter value is put to queue.."+BlockQueue01.counter);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Consumer01 implements Runnable{
    private ArrayBlockingQueue<Integer> queue;
    public Consumer01(ArrayBlockingQueue<Integer> queue){
        this.queue = queue;
    }
    @Override
    public void run() {
       while (true){
           try {
               Thread.sleep(2000);
               queue.take();
               BlockQueue01.counter--;
               System.out.println("Counter value is taken form queue.."+BlockQueue01.counter);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }
}
