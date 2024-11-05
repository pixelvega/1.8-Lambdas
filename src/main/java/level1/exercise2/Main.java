package level1.exercise2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "and", "java", "programmers");

        List<String> result = strings.stream()
                .filter(s -> s.toLowerCase().contains("o") && s.length() > 5)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
