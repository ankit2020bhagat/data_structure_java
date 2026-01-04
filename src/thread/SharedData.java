package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SharedData {

    private final List<String > list = new ArrayList<>();

    private final ReadWriteLock rwLock = new ReentrantReadWriteLock();

    private final Lock readLock = rwLock.readLock();

    private final Lock writeLock =rwLock.writeLock();

    public void  writeData(String data){
        writeLock.lock();
        try{
            list.add(data);
            System.out.println(Thread.currentThread().getName()+" add " +data);
        }
        finally {
            writeLock.unlock();
        }
    }

    public void readData(int index){
        readLock.lock();
        try{
            if(index<list.size()){
                System.out.println(Thread.currentThread().getName()+" read "+list.get(index));
            }
        }finally {
            readLock.unlock();
        }


    }

    public static void main(String[] args) {
        SharedData s= new SharedData();

        Thread write1= new Thread(() ->s.writeData("Hi"),"Thread_1");
        Thread write2 = new Thread(() ->s.writeData("Hello"),"THread_2");

        Thread read1= new Thread(()->s.readData(0),"Thread_1");
        Thread read2  = new Thread(()->s.readData(1),"thread_2");

        write1.start();
        write2.start();

        read2.start();
        read1.start();

    }
}
