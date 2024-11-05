package level1.exercise5;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface PiValue {
    double getPiValue();
}

public class Main {
    public static void main(String[] args) {
        PiValue pi = () -> 3.14;
        System.out.println(pi.getPiValue());
    }
}
