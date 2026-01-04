package thread;

public class VolatileKeyword {

    private  volatile int a=0,b=0;

    public void count(){
        a++;
        b++;
    }

    public void getCount(){
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {

        VolatileKeyword v1 = new VolatileKeyword();

        Thread t1= new Thread(() ->{
            for(int i=0;i<3;i++){
                v1.count();
            }
        });

        Thread t2= new Thread( () ->{
            for(int i=0;i<3;i++){
                v1.count();
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        v1.getCount();
    }
}
