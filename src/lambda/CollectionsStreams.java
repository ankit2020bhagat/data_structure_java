package lambda;


import java.util.Arrays;
import java.util.List;

public class CollectionsStreams {

    public static void main(String[] args) {
        List<String > name = Arrays.asList("Ankit","kumar","bhagat");
        name.stream().filter(n->n.startsWith("A"))
                .map(n->n.toUpperCase())
                .forEach(System.out::println);
    }


}
