package GenericType;

public class GenericMethods {
    public static void main(String[] args) {
        Integer[] intAarry = { 1, 2, 3 };
        String[] StringAarry = { "hello", " chandan" };
        printAarray(intAarry);
        printAarray(StringAarry);
    }

    public static <T> void printAarray(T[] Array) {
        for (T element : Array) {
            System.out.print(element);
        }
        System.out.println();
    }
}
