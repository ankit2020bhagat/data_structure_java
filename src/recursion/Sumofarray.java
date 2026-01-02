package recursion;

public class Sumofarray {

    public static int sumofarray(int[] arr, int n) {
        if (n == 0) {
            return arr[n];
        }
        return arr[n] + sumofarray(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        System.out.println(sumofarray(arr, arr.length - 1));
    }
}
