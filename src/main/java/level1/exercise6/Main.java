package level1.exercise6;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> lista = Arrays.asList("hoy", "es", "domingo", 3, 2);

        lista.stream()
                .sorted((a, b) -> {
                    int lengthA = a instanceof String ? ((String) a).length() : String.valueOf(a).length();
                    int lengthB = b instanceof String ? ((String) b).length() : String.valueOf(b).length();
                    return Integer.compare(lengthA, lengthB);
                })
                .forEach(System.out::println);
    }
}
