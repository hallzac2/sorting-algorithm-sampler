package zhall.sorting.algorithm.sampler;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author zhall
 */
public class MergeSort {

    private MergeSort() {
    }

    public static <T extends Comparable> void sort(T[] array) {
        sort(T::compareTo, array);
    }

    public static <T> void sort(Comparator<T> comparator, T[] array) {
        if (comparator == null || array == null) {
            throw new IllegalArgumentException();
        }

        mergeSort(comparator, array);
    }

    private static <T> void mergeSort(Comparator<T> comparator, T[] array) {
        if (array.length > 1) {
            int pivot = array.length / 2;
            T[] left = Arrays.copyOfRange(array, 0, pivot);
            T[] right = Arrays.copyOfRange(array, pivot, array.length);

            mergeSort(comparator, left);
            mergeSort(comparator, right);
            merge(comparator, left, right, array);
        }
    }

    private static <T> void merge(Comparator<T> comparator, T[] left, T[] right, T[] target) {
        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = 0; i < target.length; i++) {
            if (leftIndex < left.length && rightIndex < right.length) {
                if (comparator.compare(right[rightIndex], left[leftIndex]) == 1) {
                    target[i] = left[leftIndex];
                    leftIndex++;
                } else {
                    target[i] = right[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < left.length) {
                target[i] = left[leftIndex];
                leftIndex++;
            } else if (rightIndex < right.length) {
                target[i] = right[rightIndex];
                rightIndex++;
            }
        }
    }
}
