package thread;

public class CookingJob implements Runnable {
    private final String dish;

    public CookingJob(String dish) {
        this.dish = dish;
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new CookingJob("Maggie"));
        Thread t2 = new Thread(new CookingJob("Pasta"));
        Thread t3 = new Thread(new CookingJob("Samosa"));
        Thread t4 = new Thread(new CookingJob("Sandwich"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

    public void run() {
        System.out.println(dish + " is being prepared by " + Thread.currentThread().getName());
    }
}
