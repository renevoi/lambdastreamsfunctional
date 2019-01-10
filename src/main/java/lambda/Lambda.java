package lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda {

    public static void main(String[] args){

       // Game play = () -> System.out.println("play");

        List<String> collect = Stream.of("Hello", "Hillow", "Hello", "Hillow", "Musta", "Whats Up!", "Hey There")
                .filter(obj -> obj.startsWith("H"))
                .map(text -> text.substring(2))
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        collect.stream().forEach((text)-> System.out.println(text));
    }

   /* interface Game {

        void play();

    }*/
}
