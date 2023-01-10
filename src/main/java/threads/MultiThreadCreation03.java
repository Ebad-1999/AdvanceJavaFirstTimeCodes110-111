package threads;

public class MultiThreadCreation03 {

    public static void main(String[] args) throws InterruptedException {


        Brackets brackets= new Brackets();

        // thread 1
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <=7 ; i++) {
                    Brackets.generateBracket();

                }
            }
        });
        thread1.start();
        thread1.join();
        System.out.println("Thread  1 is finished ");


        // thread 2
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <=7 ; i++) {
                    Brackets.generateBracket();
                }
            }
        });


        thread2.start();
        //thread1.join();
       thread2.join(); //next lines of codes will wait until thread2 finishes
        System.out.println("thread 2 is finished");


    }

}

class Brackets{

    public synchronized static void generateBracket(){

        for (int i = 1; i <=10 ; i++) {  // [[[[]]]]]
            if (i<=5){
                System.out.print("[");
            }else {
                System.out.print("]");
            }
        }
        System.out.println("");

    }
}