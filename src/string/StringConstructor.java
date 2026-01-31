package string;

public class StringConstructor {

    public static void main(String[] args){
        String str = new String("Java");

        System.out.println(str);

        char[] charArray ={'J','A','V','A'};

        String str1 = new String(charArray);
        System.out.println(str1);

        byte[] byteArray ={ 72, 101, 108, 108, 111 };

        String str2 = new String(byteArray);
        System.out.println(str2);
    }


}
