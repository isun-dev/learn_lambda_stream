package org.example;

import java.util.function.Function;

public class Main5 {
    public static void main(String[] args) {
        Function<String, Integer> f = (String s) -> Integer.parseInt(s);
        Function<String, Integer> f2 = Integer::parseInt; // 메소드 참조
        System.out.println(f.apply("123") + 200);
        System.out.println(f2.apply("123") + 200);
    }
}
