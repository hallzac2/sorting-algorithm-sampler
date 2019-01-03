package zhall.sorting.algorithm.sampler;

import java.util.Comparator;

/**
 *
 * @author zhall
 */
public class CountingSort {

    private CountingSort() {
    }
    
    public static <T extends Comparable> void sort(T[] array) {
        sort(T::compareTo, array);
    }

    public static <T> void sort(Comparator<T> comparator, T[] array) {
        // TODO
    }
}
