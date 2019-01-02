package zhall.sorting.algorithm.sampler.util;

import java.util.Comparator;

/**
 *
 * @author zhall
 */
public class Sorts {

    private Sorts() {
    }

    public static <T extends Comparable> boolean isSorted(T[] array) {
        return isSorted(T::compareTo, array);
    }

    public static <T> boolean isSorted(Comparator<T> comparator, T[] array) {
        if (comparator == null || array == null) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (comparator.compare(array[i], array[i + 1]) == 1) {
                return false;
            }
        }
        return true;
    }
}
