package level2.exercise1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Luis", "Alberto", "Ari", "Alex", "Antonio");

        List<String> result = names.stream()
                .filter(n -> n.startsWith("A") && n.length() == 3)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
