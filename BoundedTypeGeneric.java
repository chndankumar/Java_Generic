package GenericType;

public class BoundedTypeGeneric implements IntegerContainer<Number> {
    private Number item;

    @Override
    public void add(Number item) {
        this.item = item;
    }

    @Override
    public Number get() {
        return this.item;
    }

    public static void main(String[] args) {
        BoundedTypeGeneric boundedTypeGeneric = new BoundedTypeGeneric();
        boundedTypeGeneric.add(2.456);
    }
}

interface IntegerContainer<N extends Number> {
    void add(N item);

    N get();
}
