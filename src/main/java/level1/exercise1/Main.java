package level1.exercise1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "and", "java", "programmers");

        List<String> result = strings.stream()
                .filter(s -> s.contains("o"))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}