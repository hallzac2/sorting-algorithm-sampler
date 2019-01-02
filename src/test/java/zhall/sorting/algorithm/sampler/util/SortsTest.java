package zhall.sorting.algorithm.sampler.util;

import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author zhall
 */
public class SortsTest {

    @Test
    public void testIsSorted_with_null_array() {
        assertThrows(IllegalArgumentException.class, () -> Sorts.isSorted(null));
    }

    @Test
    public void testIsSorted_with_null_comparator() {
        assertThrows(IllegalArgumentException.class, () -> Sorts.isSorted(null, new Integer[]{}));
    }

    @ParameterizedTest()
    @MethodSource("getIsSortedArgs")
    public void testIsSorted(Integer[] array, boolean expected) {
        assertEquals(expected, Sorts.isSorted(array));
    }

    private static Stream<Arguments> getIsSortedArgs() {
        return Stream.of(
                Arguments.of(new Integer[]{}, true),
                Arguments.of(new Integer[]{1, 2, 3}, true),
                Arguments.of(new Integer[]{-1, 0, 1}, true),
                Arguments.of(new Integer[]{100, -100}, false),
                Arguments.of(new Integer[]{3, 2, 1}, false)
        );
    }
}
