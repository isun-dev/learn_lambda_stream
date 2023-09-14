package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main7 {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        Stream<Integer> intStream = list.stream(); // list로부터 Stream을 생성
//        intStream.forEach(System.out::println); // Stream을 순회하며 출력
        // intStream.forEach(System.out::println); // Stream을 순회하며 출력 -> 에러 발생

        // stream은 1회용이다. stream에 대해 최종연산을 수행하면 stream이 닫힌다.

        Stream<String> strStream = Stream.of("a", "b", "c"); // 가변인자
        strStream.forEach(System.out::println);

        String[] strArr = {"A", "B", "C", "D"};
        String[] strArr2 = {"a", "b", "c", "d"};
        Stream<String> test = Stream.of(strArr);
        test.forEach(System.out::println);

        Stream<String> test2 = Arrays.stream(strArr2);
        test2.forEach(System.out::println);

        int[] intArr = {1, 2, 3, 4, 5};
        Arrays.stream(intArr).forEach(System.out::println);

    }
}
