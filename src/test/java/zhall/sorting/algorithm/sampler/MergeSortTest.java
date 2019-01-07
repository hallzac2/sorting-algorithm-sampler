package zhall.sorting.algorithm.sampler;

import java.util.Arrays;
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
public class MergeSortTest {

    @Test
    public void testSort_with_null_array() {
        assertThrows(IllegalArgumentException.class, () -> MergeSort.sort(null));
    }

    @Test
    public void testSort_with_null_comparator() {
        assertThrows(IllegalArgumentException.class, () -> MergeSort.sort(null, new Integer[]{}));
    }

    @ParameterizedTest
    @ArgumentsSource(SortTestArguments.class)
    public void testSort(Integer[] array) {
        MergeSort.sort(array);
        assertTrue(Sorts.isSorted(array));
    }
}
