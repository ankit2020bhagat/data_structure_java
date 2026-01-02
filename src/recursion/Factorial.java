package recursion;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(facorial(4));
    }

    public static int facorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * facorial(n - 1);
    }
}
