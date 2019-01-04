package zhall.sorting.algorithm.sampler;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import zhall.sorting.algorithm.sampler.util.Sorts;

/**
 *
 * @author zhall
 */
public class QuickSortTest {

    @Test
    public void testIterativeSort_with_null_array() {
        assertThrows(IllegalArgumentException.class, () -> QuickSort.iterativeSort(null));
    }

    @Test
    public void testIterativeSort_with_null_comparator() {
        assertThrows(IllegalArgumentException.class, () -> QuickSort.iterativeSort(null, new Integer[]{}));
    }

    @ParameterizedTest
    @ArgumentsSource(SortTestArguments.class)
    public void testIterativeSort(Integer[] array) {
        QuickSort.recursiveSort(array);
        assertTrue(Sorts.isSorted(array));
    }

    @Test
    public void testRecursiveSort_with_null_array() {
        assertThrows(IllegalArgumentException.class, () -> QuickSort.recursiveSort(null));
    }

    @Test
    public void testRecursiveSort_with_null_comparator() {
        assertThrows(IllegalArgumentException.class, () -> QuickSort.recursiveSort(null, new Integer[]{}));
    }

    @ParameterizedTest
    @ArgumentsSource(SortTestArguments.class)
    public void testRecursiveSort(Integer[] array) {
        QuickSort.recursiveSort(array);
        assertTrue(Sorts.isSorted(array));
    }
}
