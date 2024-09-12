package GenericType;

public class CustomGenericClass {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(); // Box is now type-safe
        box.setValue(1); // No issue, it's an Integer
        Integer i = box.getValue(); // No casting needed
        System.out.println(i);
    }
}

class Box<T> {
    // one or more type parameters
    // These type parameters are placeholders that are replaced with specific types
    // when the class is instantiated.
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}