package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main3 {
    public static void main(String[] args) {
        // 매개변수는 없고, 반환값만 있음
        Supplier<Integer> s = () -> (int) (Math.random() * 100) + 1;
        // 매개변수만 있고, 반환값이 없음
        Consumer<Integer> c = i -> System.out.println(i + ", ");
        // 조건식을 표현하는데 사용됨. 매개변수는 하나, 반환타입은 불린
        Predicate<Integer> p = i -> i % 2 == 0;
        // 일반적인 함수. 하나의 매개변수를 받아서 결과를 반환
        Function<Integer, Integer> f = i -> i % 10 * 10;

        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list); // list를 랜덤값으로 채운다.
        System.out.println(list);

        printEvenNum(p, c, list); // list에서 짝수만 출력한다.
        List<Integer> newList = doSomething(f, list); // list의 값들을 변환한다.
        System.out.println(newList);

    }

    static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
        // Function<T, T> f는 T 타입의 입력을 받아서 T 타입의 결과를 반환하는 함수를 나타냅니다.
        List<T> newList = new ArrayList<T>(list.size());

        for (T i : list) {
            newList.add(f.apply(i));
        }

        return newList;
    }

    static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
        System.out.println("[");
        for (T i : list) {
            if (p.test(i)) {
                c.accept(i);
            }
        }
        System.out.println("]");
    }

    static <T> void makeRandomList(Supplier<T> s, List<T> list) {
        for (int i = 0; i < 10; i++) {
            list.add(s.get());
        }
    }
}
