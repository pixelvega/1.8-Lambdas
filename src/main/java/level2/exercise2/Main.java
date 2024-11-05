package level2.exercise2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 55, 44);

        String result = numbers.stream()
                .map(n -> (n % 2 == 0 ? "e" : "o") + n)
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
