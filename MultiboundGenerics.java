package GenericType;

interface Printable {
    void print();
}

class MyNumber extends Number implements Printable {
    private int value;

    public MyNumber(int value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }

    @Override
    public void print() {
        System.out.println(value);
    }
}

class Boxes<T extends Number & Printable> {
    private T item;

    public Boxes(T item) {
        this.item = item;
    }

    public void display() {
        item.print();
    }

    public T getItem() {
        return item;
    }
}

public class MultiboundGenerics {
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(11);
        Boxes<MyNumber> boxes = new Boxes<>(myNumber);
        boxes.display();
    }
}
