package org.example;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main6 {
    public static void main(String[] args) {
        // Supplier는 입력은 없고, 출력은 있다.
        Supplier<MyClass> s = () -> new MyClass();
        System.out.println(s.get()); // 클래스 주소를 출력한다.

        // 메소드 참조 -> 아래처럼 간단하게 쓸수 있다
        Supplier<MyClass> s2 = MyClass::new;

        // 생성자가 있을 경우?
        Function<String, MyClass2> f = (name) -> new MyClass2(name);
        System.out.println(f.apply("nicole").name); // 클래스 주소를 출력한다.

        Function<String, MyClass2> f2 = MyClass2::new;
        System.out.println(f2.apply("nicole2").name); // 클래스 주소를 출력한다.

        // 배열 생성 -> 꼭 Function을 사용해야 함. 배열의 길이를 입력받아야 하기 때문.
        Function<Integer, int[]> f3 = (size) -> new int[size];
        System.out.println(f3.apply(10).length); // 10

        Function<Integer, int[]> f4 = int[]::new;
        System.out.println(f4.apply(100).length); // 100
    }
}


