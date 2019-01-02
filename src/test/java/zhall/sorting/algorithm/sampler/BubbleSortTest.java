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
public class BubbleSortTest {

    @Test
    public void testSort_with_null_array() {
        assertThrows(IllegalArgumentException.class, () -> BubbleSort.sort(null));
    }

    @Test
    public void testSort_with_null_comparator() {
        assertThrows(IllegalArgumentException.class, () -> BubbleSort.sort(null, new Integer[]{}));
    }
    
    @ParameterizedTest
    @ArgumentsSource(SortTestArguments.class)
    public void testSort(Integer[] array) {
        BubbleSort.sort(array);
        assertTrue(Sorts.isSorted(array));
    }
}
