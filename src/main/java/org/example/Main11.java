package org.example;

import java.io.File;
import java.util.stream.Stream;

public class Main11 {
    public static void main(String[] args) {
        File[] fileArr = {
                new File("EX1.java"),
                new File("EX1.bak"),
                new File("EX1"),
                new File("EX1.txt"),
                new File("EX2.java")
        };

        Stream<File> fileStream = Stream.of(fileArr);

        // map()으로 Stream<File>을 Stream<String>으로 변환
        Stream<String> filenameStream = fileStream.map(File::getName);
        filenameStream.forEach(System.out::println); // 모든 파일의 이름 출력

        fileStream = Stream.of(fileArr); // 스트림을 다시 생성

        fileStream.map(File::getName) // Stream<File>을 Stream<String>으로 변환
                .filter(s -> s.indexOf('.') != -1) // 확장자가 없는 것은 제외
                .peek(s -> System.out.printf("filename=%s%n", s)) // 파일 이름 출력
                .map(s -> s.substring(s.indexOf('.') + 1)) // 확장자만 추출
                .map(String::toUpperCase) // 모두 대문자로 변환
                .peek(s -> System.out.printf("extension=%s%n", s)) // 확장자 출력
                .distinct() // 중복 제거
                .forEach(System.out::print); // JAVABAKTXT
        System.out.println();
    }
}
