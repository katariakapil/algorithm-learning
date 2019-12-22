import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaLearn {

    public static void main(String[] args) {


        List<String> names = Arrays.asList("Kapil","Kannu","Raj","Tinku");


      //  Collections.sort(names , (a1, b1) -> a1.compareTo(b1));

        Collections.sort(names);

        List<String> lowweCase = names.stream().filter(a -> a.startsWith("Ka"))
                .map(a -> a.toLowerCase()).collect(Collectors.toList());

        lowweCase.forEach(System.out::println);
    }
}
