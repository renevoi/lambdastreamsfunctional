import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PeekAndSkipStream {

    public static void main(String[] args){

        List<String> collect = Stream.of("One", "Two", "Three")
                .filter(obj -> !obj.equals("One"))
                .peek(obj -> System.out.println("Peeked " + obj))
                .collect(Collectors.toList());

        System.out.println(collect);

        collect.forEach(num -> System.out.println(num));

        IntStream.of(1,23,4,6,5,7)
                .skip(2)
                .filter(i -> i > 5)
                .forEach(i -> System.out.println(i));


    }


}
