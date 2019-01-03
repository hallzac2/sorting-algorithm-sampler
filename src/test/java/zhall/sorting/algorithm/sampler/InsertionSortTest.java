package zhall.sorting.algorithm.sampler;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import zhall.sorting.algorithm.sampler.util.Sorts;

/**
 *
 * @author zhall
 */
public class InsertionSortTest {

    @Test
    public void testSort_with_null_array() {
        assertThrows(IllegalArgumentException.class, () -> InsertionSort.sort(null));
    }

    @Test
    public void testSort_with_null_comparator() {
        assertThrows(IllegalArgumentException.class, () -> InsertionSort.sort(null, new Integer[]{}));
    }

    @ParameterizedTest
    @ArgumentsSource(SortTestArguments.class)
    public void testSort(Integer[] array) {
        InsertionSort.sort(array);
        assertTrue(Sorts.isSorted(array));
    }
}
