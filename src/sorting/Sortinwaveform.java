package sorting;

public class Sortinwaveform {

    public static void sortInwave(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
            i++;

        }
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 8, 9, 10};
        sortInwave(arr);

    }
}
