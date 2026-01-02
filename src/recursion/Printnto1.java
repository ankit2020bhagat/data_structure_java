package recursion;

public class Printnto1 {

    public static void printnto1(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printnto1(n - 1);
    }

    public static void main(String[] args) {
        printnto1(5);
    }
}
