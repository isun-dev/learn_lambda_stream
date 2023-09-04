package org.example;

@FunctionalInterface
interface MyFunction2 {
    void run();
}

public class Main2 {
    static void execute(MyFunction2 f) { // 매개변수의 타입이 MyFunction2인 메소드
        f.run();
    }

    static MyFunction2 getMyFunction() { // 반환 타입이 MyFunction2인 메소드
        return () -> System.out.println("f3.run()");
    }

    public static void main(String[] args) {
        // 람다식으로 MyFunction2의 run()을 구현
        MyFunction2 f1 = () -> System.out.println("first >> f1.run()"); // just 구현, not 실행

        // 익명 클래스로 람다식을 구현
        MyFunction2 f2 = new MyFunction2() { // just 구현, not 실행

            @Override
            public void run() {
                System.out.println("second >> f2.run()");
            }
        };

        MyFunction2 f3 = getMyFunction(); // just 구현, not 실행

        f1.run();
        f2.run();
        f3.run();

        execute(f1);

    }
}
