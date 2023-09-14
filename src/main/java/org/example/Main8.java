package org.example;

import java.util.Random;
import java.util.stream.IntStream;

public class Main8 {
    public static void main(String[] args) {
        IntStream intStream = new Random().ints();
        intStream.limit(5).forEach(System.out::println);
        // limit을 지정해주지 않으면 무한 스트림이기 때문에 무한개가 출력이 된다.

        // 10부터 20사이의 난수
        IntStream intStream1 = new Random().ints(10, 20).limit(5);
        intStream1.forEach(System.out::println);
    }
}
