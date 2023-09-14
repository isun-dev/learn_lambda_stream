package org.example;

import java.util.stream.Stream;

public class Main9 {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.iterate(0, n -> n + 2);
        integerStream.limit(10).forEach(System.out::println);

        Stream<Integer> oneStream = Stream.generate(() -> 1);
        oneStream.limit(10).forEach(System.out::println);
    }
}
