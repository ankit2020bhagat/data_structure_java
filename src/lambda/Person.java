package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Custtomer{
    private int age;
    private String name;

    public Custtomer(int age,String name){
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}

public class Person {

    public static int compareByName(Custtomer a, Custtomer b)	{
        return a.getName().compareTo(b.getName());
    }
    public static int compareByAge(Custtomer a, Custtomer b) {
        return Integer.compare(a.getAge(), b.getAge());
    }

    public static void main(String[] args) {
        List<Custtomer> personlist = new ArrayList<>();

        personlist.add(new Custtomer(18,"Ankit"));
        personlist.add(new Custtomer(20,"kumar"));
        personlist.add(new Custtomer(25,"Bhagat"));

        Collections.sort(personlist,Person::compareByAge);

        System.out.println("Sorted by name");

        personlist.stream().map(x-> x.getAge()).forEach(System.out::println);

        System.out.println();

        Collections.sort(personlist,Person::compareByName);
        personlist.stream().map(x-> x.getName()).forEach(System.out::println);
    }

}
