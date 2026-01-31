package string;

public class Immutable {

    public static void main(String[] args){
        String s1 ="Hello";
        String s2="Hello";
        System.out.println(s1==s2);

        s1 = s1.concat("World");
        System.out.println(s1==s2);

        String s3 = new String("Hello");
        System.out.println(s2==s3);
        System.out.println(s3.equals(s3));
    }
}
