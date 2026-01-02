package thread;

public class Deadlocking {

    public static void main(String[] args) {

        try {
            System.out.println("Entering into a deadlock");

            Thread.currentThread().join();

            System.out.println("This statement will neve executed");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
