package GenericType;

import java.util.*;

public class WildCardGeneric {

    public static void main(String[] args) {
        List<? extends Number> number = Arrays.asList(1, 3, 4);
        // number.add(20); this will not work
        List<? super Integer> numbers = Arrays.asList(1, 3, 4);
        numbers.add(20);
    }

    public static double sum(List<? extends Number> number) {
        double sum = 0;
        for (Number n : number) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void printNumber(List<? super Integer> number) {

        for (Object obj : number) {
            System.out.println(obj);
        }
    }
}
