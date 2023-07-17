package Utils;

public class Pair<T,U> {
    private T first;
    private U second;
    public Pair(T t1, U t2) {
        first = t1;
        second = t2;
    }
    public T getFirst() {
        return first;
    }
    public U getSecond() {
        return second;
    }
}
