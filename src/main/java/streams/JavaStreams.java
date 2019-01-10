package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {

    public static void main(String[] args){


        IntStream
                .range(1, 10)
                .skip(3)
                .filter(i -> i>6)
                .forEach(System.out::print);

        System.out.println();

        int sum = IntStream
                .range(1, 10)
                .sum();

        System.out.println(sum);

        Stream.of("Renevoi", "Ailia", "Grace")
                //.filter(name -> !name.equals("Renevoi"))
                .sorted()
                //.forEach(System.out::println);
                .findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("Not Found"));

        String[] names = {"Ally", "Jane", "Clark", "James", "Danny", "Oscar", "Renevoi", "Grace", "Ailia"};
        Arrays.stream(names)
                .filter(name -> name.startsWith("J"))
                .sorted()
                .forEach(System.out::println);

        Arrays.stream(new int[] {2, 4, 5, 6, 7})
                .map(x -> x*x)
                .average()
                .ifPresent(System.out::println);

        List<String> people = Arrays.asList("Ally", "Jane", "Clark", "James", "Danny", "Oscar", "Renevoi", "Grace", "Ailia");

                people.stream()
                        .filter(name -> name.startsWith("J"))
                        .filter(name -> name.contains("an"))
                        .map(String::toLowerCase)
                        .forEach(System.out::println);


    }

}
