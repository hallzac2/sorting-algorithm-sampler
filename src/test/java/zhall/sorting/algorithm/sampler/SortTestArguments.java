package zhall.sorting.algorithm.sampler;

import java.util.stream.Stream;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

/**
 *
 * @author zhall
 */
public class SortTestArguments implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext ec) throws Exception {
        return Stream.of(
                Arguments.of((Object) new Integer[]{}),
                Arguments.of((Object) new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}),
                Arguments.of((Object) new Integer[]{1, -1, 2, -2, 3, -3, 4, -4}),
                Arguments.of((Object) new Integer[]{1, 0, -1}),
                Arguments.of((Object) new Integer[]{-1, 0, 1}),
                Arguments.of((Object) new Integer[]{3, 2, 1})
        );
    }
}
