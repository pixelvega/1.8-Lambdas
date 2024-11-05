package level1.exercise7;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface PiValue {
    double getPiValue();
}

public class Main {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("Tales", "of", "Mystery", "and", "Imagination");

        lista.stream()
                .sorted((a, b) -> Integer.compare(b.length(), a.length()))
                .forEach(System.out::println);
    }
}
