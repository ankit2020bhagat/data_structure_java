package thread;

class SharedData1{
    public synchronized void display(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }


}

class Worker1 extends Thread {
    SharedData1 s;
    Worker1(SharedData1 s){
        this.s = s;
    }

    public void run(){
        s.display("Geeks");
    }
}

class Worker2 extends Thread{
    SharedData1 s ;
    Worker2(SharedData1 s){
        this.s =s;
    }
    public void run(){
        s.display("Ankit");
    }
}

public class Monitor {

    public static void main(String[] args) {
        SharedData1 s = new SharedData1();

        Worker2 t2 =new Worker2(s);
        Worker1 t1= new Worker1(s);

        t1.start();
        t2.start();

        try{
            t2.join();
            t1.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
