package level1.exercise8;

@FunctionalInterface
interface ReverseString {
    String reverse(String str);
}

public class Main {
    public static void main(String[] args) {
        ReverseString reverse = (str) -> new StringBuilder(str).reverse().toString();

        String cadena = "lambda";
        System.out.println(reverse.reverse(cadena));
    }
}
