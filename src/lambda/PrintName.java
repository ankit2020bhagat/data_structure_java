package lambda;

import java.util.Arrays;

public class PrintName {
    public static void print(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        String[] names ={"Ankit","kumar","Bhagat"};

        Arrays.stream(names).forEach(PrintName::print);
    }
}
