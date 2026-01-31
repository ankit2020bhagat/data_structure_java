package string;

public class BufferString {

    public static void main(String[] args){
        StringBuffer str = new StringBuffer();
        str.append("Ankit");
        str.append("Kumar");
        str.append("Bhagat");
        System.out.println(str);

        StringBuffer str2 = new StringBuffer(50);
        str2.append("Ankit");
        str2.append("bhagat");
        System.out.println(str2);
    }
}
