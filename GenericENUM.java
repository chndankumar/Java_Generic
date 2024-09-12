package GenericType;

enum operations {
    add, sub, multiply, divide;

    public <T extends Number> double apply(T a, T b) {
        switch (this) {
            case add:
                return a.doubleValue() + b.doubleValue();
            case sub:
                return a.doubleValue() - b.doubleValue();
            case multiply:
                return a.doubleValue() * b.doubleValue();
            case divide:
                return a.doubleValue() / b.doubleValue();
            default:
                throw new AssertionError("unkown error" + this);
        }
    }
}

public class GenericENUM {
    public static void main(String[] args) {
        double res = operations.multiply.apply(20.0, 0.10);
        System.out.println(res);
    }
}
