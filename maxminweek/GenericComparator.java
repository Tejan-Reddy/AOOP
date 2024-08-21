public class GenericComparator<T extends java.lang.Comparable<T>> implements Comparable<T> {
    @Override
    public T max(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    @Override
    public T min(T a, T b) {
        return a.compareTo(b) < 0 ? a : b;
    }
}
