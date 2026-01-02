package recursion;

public class Print1ton {

    public static void printtoN(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printtoN(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        printtoN(10);
    }
}
