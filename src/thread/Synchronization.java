package thread;

public class Synchronization {
    private int count = 0;

    public static void main(String[] args) {

        Synchronization s = new Synchronization();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                s.Count();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                s.Count();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(s.getCount());

    }

    public void Count() {
        synchronized (this) {
            count++;
        }

    }

    public synchronized int getCount() {
        return count;
    }
}
