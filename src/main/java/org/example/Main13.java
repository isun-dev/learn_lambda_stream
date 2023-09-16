package org.example;

import java.util.Optional;

public class Main13 {
    public static void main(String[] args) {
        int[] arr = null;// 바람직한 코드가 아니다.
        int[] arr2 = new int[0];// 위 코드 보다는 바람직 하다.
        System.out.println(arr2.length);

        System.out.println("=====================================");

        Optional<String> opt = null; // 사용할 수는 있지만, 바람직한 코드가 아니다.
        Optional<String> opt2 = Optional.empty(); // 위 코드 보다는 바람직 하다.
        System.out.println(opt2);

        System.out.println("=====================================");

        System.out.println(opt2.get()); // NPException 발생하기 때문에 잘 사용하지 않는다. -> 이거 사용하면 try catch 써줘야 함

        System.out.println("=====================================");

        String str = opt2.orElse("empty");

        System.out.println("=====================================");

        String str2 = opt2.orElseGet(() -> new String("empty"));
        String str3 = opt2.orElseGet(String::new);

    }
}
