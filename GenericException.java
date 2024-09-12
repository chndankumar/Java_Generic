package GenericType;

public class GenericException {

    public static void main(String[] args) {
        try {
            throw new MyExceptions(123);
        } catch (MyExceptions e) {
            System.out.println("Cautgh Exceptions:   " + e.getMessage());
        }

        try {
            throw new MyExceptions("String");
        } catch (MyExceptions e) {
            System.out.println("Cautgh Exceptions:   " + e.getMessage());
        }

    }

}

class MyExceptions extends Exception {
    public <T> MyExceptions(T value) {
        super("Exceptions Related to Value" + value.toString() + "type of" + value.getClass().getName());
    }
}
