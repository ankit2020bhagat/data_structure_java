package twoPointer;

public class SentencePalindrome {

    public static boolean sentencePalindrome(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                res.append(Character.toLowerCase(str.charAt(i)));
            }
        }
        int left = 0;
        int right = res.length() - 1;
        while (right >= left) {
            if (res.charAt(left) != res.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }

    public static void main(String[] args) {
        String str = "Abc 012..##  10cbA";
        System.out.println(sentencePalindrome(str));
    }
}
