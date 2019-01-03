package zhall.sorting.algorithm.sampler;

import java.util.Comparator;

/**
 *
 * @author zhall
 */
public class InsertionSort {

    private InsertionSort() {
    }

    public static <T extends Comparable> void sort(T[] array) {
        sort(T::compareTo, array);
    }

    public static <T> void sort(Comparator<T> comparator, T[] array) {
        if (comparator == null || array == null) {
            throw new IllegalArgumentException();
        }

        for (int index = 1; index < array.length; index++) {
            int position = index;
            T temp = array[position];
            while (position > 0 && comparator.compare(array[position - 1], temp) == 1) {
                array[position] = array[position - 1];
                position--;
            }
            array[position] = temp;
        }
    }
}
