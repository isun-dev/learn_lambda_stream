package org.example;

import java.util.Comparator;
import java.util.stream.Stream;

public class Main10 {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(new Student("이동원", 3, 300),
                new Student("강동원", 4, 500));

        studentStream.sorted(Comparator.comparing(Student::getBan)
                        .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);
    }
}

class Student implements Comparable<Student> {
    String name;
    int ban;
    int totalScore;

    Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String toString() {
        return String.format("[%s, %d, %d]", name, ban, totalScore);
    }

    String getName() {
        return name;
    }

    int getBan() {
        return ban;
    }

    int getTotalScore() {
        return totalScore;
    }


    // 총점 내림차순을 기본 정렬로 한다.
    @Override
    public int compareTo(Student s) {
        return s.totalScore - this.totalScore;
    }
}
