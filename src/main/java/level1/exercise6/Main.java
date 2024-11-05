package level1.exercise6;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("hoy", "es", "domingo");

        lista.stream()
                .sorted((a, b) -> Integer.compare(a.length(), b.length()))
                .forEach(System.out::println);
    }
}
