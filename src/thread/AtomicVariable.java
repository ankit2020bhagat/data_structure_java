package thread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariable {

    AtomicInteger count = new AtomicInteger();

    public void counter(){
        count.incrementAndGet();
    }

    public void getCount(){
        System.out.println(count);
    }
    public static void main(String[] args) {


        AtomicVariable a= new AtomicVariable();

        Thread t1 = new Thread(() ->{
            for(int i=0;i<2000;i++){
                a.counter();
            }
        });

        Thread t2 =new Thread(()->{
            for(int i=0;i<2000;i++){
                a.counter();
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        a.getCount();

    }
}
