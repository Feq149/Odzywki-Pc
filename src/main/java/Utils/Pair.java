package Utils;

public class Pair<T> {
    private T first,second;
    public Pair(T t1, T t2) {
        first = t1;
        second = t2;
    }
    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }
}
