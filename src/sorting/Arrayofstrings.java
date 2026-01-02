package sorting;


import java.util.Arrays;
import java.util.Comparator;

public class Arrayofstrings {
    public static String[] sortString(String[] arr) {
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        return arr;

    }

    public static void main(String[] args) {
        String[] arr = {"GeeksforGeeeks", "I", "from", "am"};
        sortString(arr);
        for (String str : arr) {
            System.out.println(str);
        }
    }
}
