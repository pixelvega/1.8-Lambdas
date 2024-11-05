package level1.exercise5;

public class Main {
    public static void main(String[] args) {
        PiValue pi = () -> 3.14;
        System.out.println(pi.getPiValue());
    }
}
