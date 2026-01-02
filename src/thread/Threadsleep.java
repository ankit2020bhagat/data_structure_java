package thread;

public class Threadsleep extends Thread {

    public static void main(String[] args) {

        Threadsleep task = new Threadsleep();
        task.start();
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.print(i + " ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.print(i + " ");
            }


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
