package string;

public class Reversing {
    public static void main(String[] args){
        String str1 ="Ankit";
        String str2="";
        for(int i=str1.length()-1;i>=0;i--){
            str2 = str2.concat(Character.toString(str1.charAt(i)));
        }
        System.out.println(str2);
    }
}
