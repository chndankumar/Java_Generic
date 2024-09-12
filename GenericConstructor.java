package GenericType;
// Non-generic class

public class GenericConstructor {
    private Object item;

    // Generic constructor for any type of object
    public <T> GenericConstructor(T item) {
        this.item = item;
        System.out.println("Generic constructor called with item: " + item);
    }

    // Generic constructor restricted to Number types
    public <T extends Number> GenericConstructor(T item, boolean isNumberConstructor) {
        this.item = item;
        System.out.println("Number-specific constructor called with item: " + item);
        System.out.println("Performing additional operations for Number...");
    }

    public Object getItem() {
        return item;
    }

    public static void main(String[] args) {
        // Example 1: Using the generic constructor with a String
        GenericConstructor stringContainer = new GenericConstructor("Hello, World!");

        // Example 2: Using the generic constructor with a custom object
        GenericConstructor personContainer = new GenericConstructor(new Person("Alice", 25));

        // Example 3: Using the number-specific constructor with an Integer
        GenericConstructor numberContainer = new GenericConstructor(100, true);

        // Example 4: Using the number-specific constructor with a Double
        GenericConstructor doubleContainer = new GenericConstructor(99.99, true);
    }
}

// A simple Person class for demonstration purposes
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
