package level2.exercise4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("Hello", "2", "World", "3", "elefante", "1", "4", "a");

        List<String> sortedList = lista.stream()
                .sorted((s1, s2) -> Character.compare(s1.charAt(0), s2.charAt(0)))
                .collect(Collectors.toList());
        System.out.println("Lista ordenada: " + sortedList);

        List<String> withEfirst = lista.stream()
                .sorted((s1, s2) -> {
                    if (s1.contains("e") && !s2.contains("e")) return -1;
                    if (!s1.contains("e") && s2.contains("e")) return 1;
                    return 0;
                })
                .collect(Collectors.toList());
        System.out.println("Cadenas con 'e' primero: " + withEfirst);

        List<String> modifiedList = lista.stream()
                .map(s -> s.replace('a', '4'))
                .collect(Collectors.toList());
        System.out.println("Lista modificada (reemplazo de 'a' por '4'): " + modifiedList);

        List<String> filteredNumbers = lista.stream()
                .filter(s -> s.matches("\\d+"))
                .collect(Collectors.toList());
        System.out.println("Elementos numéricos: " + filteredNumbers);
    }
}
