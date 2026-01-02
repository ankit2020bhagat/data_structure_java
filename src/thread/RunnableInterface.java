package thread;

import java.io.FileNotFoundException;

public class RunnableInterface {

    public static void main(String[] args) {

        Thread task = new Thread(new RunnableInterface().new RunnavbleImplements());

        task.start();

    }

    private class RunnavbleImplements implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is executing ");

            try {
                throw new FileNotFoundException();

            } catch (FileNotFoundException e) {
                System.out.println("Must catch here");
                e.printStackTrace();
            }
            int r = 1 / 0;
        }
    }
}

