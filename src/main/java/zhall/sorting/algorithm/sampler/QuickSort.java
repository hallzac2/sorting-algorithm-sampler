package zhall.sorting.algorithm.sampler;

import java.util.Comparator;

/**
 *
 * @author zhall
 */
public class QuickSort {

    private QuickSort() {
    }

    public static <T extends Comparable> void iterativeSort(T[] array) {
        recursiveSort(T::compareTo, array);
    }

    public static <T> void iterativeSort(Comparator<T> comparator, T[] array) {
        if (comparator == null || array == null) {
            throw new IllegalArgumentException();
        }

        int pivot, start, end;
        int[] stack = new int[array.length];
        int top = -1;
        stack[++top] = 0;
        stack[++top] = array.length - 1;

        while (top > -1) {
            end = stack[top--];
            start = stack[top--];
            pivot = partition(comparator, array, start, end);

            if (pivot > start) {
                stack[++top] = start;
                stack[++top] = pivot;
            }

            if (pivot < end) {
                stack[++top] = pivot + 1;
                stack[++top] = end;
            }
        }
    }

    public static <T extends Comparable> void recursiveSort(T[] array) {
        recursiveSort(T::compareTo, array);
    }

    public static <T> void recursiveSort(Comparator<T> comparator, T[] array) {
        if (comparator == null || array == null) {
            throw new IllegalArgumentException();
        }

        recursiveQuickSort(comparator, array, 0, array.length - 1);
    }

    private static <T> void recursiveQuickSort(Comparator<T> comparator, T[] array, int start, int end) {
        if (start < end) {
            int pivot = partition(comparator, array, start, end);
            recursiveQuickSort(comparator, array, start, pivot);
            recursiveQuickSort(comparator, array, pivot + 1, end);
        }
    }

    private static <T> int partition(Comparator<T> comparator, T[] array, int start, int end) {
        int pivot = start;
        T tempVal;

        for (int i = start + 1; i <= end; i++) {
            if (comparator.compare(array[start], array[i]) == 1) {
                pivot = pivot + 1;
                tempVal = array[i];
                array[i] = array[pivot];
                array[pivot] = tempVal;
            }
        }

        tempVal = array[start];
        array[start] = array[pivot];
        array[pivot] = tempVal;

        return pivot;
    }
}
