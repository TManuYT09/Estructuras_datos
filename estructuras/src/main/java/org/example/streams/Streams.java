package org.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        Stream<Integer> numeros = Stream.of(1,2,3,4,5);
        List<Integer> numeritos = new ArrayList<>(Arrays.asList(1,2,2,3,4,5,45,149,149,400));

        long filtrados = numeritos.stream()
                .filter(nums -> nums > 10)
                .distinct()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(filtrados);

        List<String> pueblos = new ArrayList<>(Arrays.asList("Elche","San Vicente","Mutxamel","Eliana"));

        pueblos.stream()
//                .map(String::toUpperCase)
//                .filter(pueblo -> pueblo.contains("I"))
//                .filter(pueblo -> pueblo.endsWith("A"))
                .sorted()
                .distinct()
                .forEach(System.out::println);
    }
}
