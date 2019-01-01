package zhall.sorting.algorithm.sampler;

import java.util.Comparator;

/**
 *
 * @author zhall
 */
public class BubbleSort {

    private BubbleSort() {
    }

    // TODO check inputs for errors
    public static <T> void sort(Comparator<T> comparator, T[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (comparator.compare(array[j], array[j + 1]) == 1) {
                    T temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
