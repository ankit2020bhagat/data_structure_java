package thread;

public class Mainthread {

    public static void main(String[] args) {

        Thread t = Thread.currentThread();
        System.out.println("Current Thread name " + t.getName());
        t.setName("Test");
        System.out.println("Current thread after modiification " + t.getName());

        System.out.println("Current thread priority " + t.getPriority());

        t.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Thread priority after modification " + t.getPriority());

        Thread childThread = new Thread() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(i);
                }
            }
        };
        childThread.start();
        System.out.println("Child thread priority " + childThread.getPriority());


    }
}
