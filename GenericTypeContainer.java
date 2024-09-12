package GenericType;

public class GenericTypeContainer<T> implements Container<T> {

    private T item;

    @Override
    public void add(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return item;
    }

    public static void main(String[] args) {
        GenericTypeContainer<Integer> GTCint = new GenericTypeContainer<>();
        GTCint.add(232);
        GenericTypeContainer<String> GTCstring = new GenericTypeContainer<>();
        GTCstring.add("Lemon");
    }

}

interface Container<T> {
    void add(T item);

    T get();
}
