public class GenericArrayUtils {

    public static <T extends java.lang.Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        T max = array[0];
        for (T element : array) {
            max = new GenericComparator<T>().max(max, element);
        }
        return max;
    }

    public static <T extends java.lang.Comparable<T>> T findMin(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        T min = array[0];
        for (T element : array) {
            min = new GenericComparator<T>().min(min, element);
        }
        return min;
    }
}
