package thread;

import java.util.concurrent.locks.ReentrantLock;

public class Worker implements Runnable{

   private ReentrantLock lock ;
   private String name;

    Worker(ReentrantLock lock ,String name){
       this.lock = lock;
       this.name =name;
   }
    @Override
    public void run(){
        lock.lock();
        try{
            System.out.println(name +" lock acquired");
            Thread.sleep(1000);
            System.out.println(name +" work finished");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();



        Thread t1 =new Thread(new Worker(lock,"thread_1"));

        Thread t2= new Thread(new Worker(lock,"thread_2"));

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
