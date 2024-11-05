package level2.exercise3;

@FunctionalInterface
interface Operation {
    float calc(float a, float b);
}

public class Main {
    public static void main(String[] args) {
        Operation suma = (a, b) -> a + b;
        Operation resta = (a, b) -> a - b;
        Operation multiplicacion = (a, b) -> a * b;
        Operation division = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("No se puede dividir por cero");
            }
            return a / b;
        };

        System.out.println("Suma: " + suma.calc(10, 5));
        System.out.println("Resta: " + resta.calc(10, 5));
        System.out.println("Multiplicación: " + multiplicacion.calc(10, 5));
        System.out.println("División: " + division.calc(10, 5));
    }
}
