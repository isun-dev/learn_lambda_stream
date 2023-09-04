package org.example;

@FunctionalInterface // 함수형 인터페이스는 단 하나의 추상 메소드만 가져야 함.
interface MyFunction {
    public abstract int max(int a, int b);

}

public class Main {
    public static void main(String[] args) {
//        MyFunction f = new MyFunction() {
//            @Override
//            public int max(int a, int b) { // 오버라이딩 : 접근제어자는 좁게 못바꿈.
//                return a > b ? a : b;
//            }
//        };
//         위 코드는 아래의 람다식으로 간단히 바꿀 수 있다
        MyFunction f = (a, b) -> a > b ? a : b;
        // 람다식을 다루기 위한 참조변수의 타입은 함수형 인터페이스


        int value = f.max(3, 5); // 함수형 인터페이스
    }
}