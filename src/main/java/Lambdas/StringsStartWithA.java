package streamsAndLamdas;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringsStartWithA {
    public static List<String> filterStringsStartingWithA(List<String> strings) {
        Predicate<String> startsWithA = str -> str.startsWith("A");

        return strings.stream()
                .filter(startsWithA.negate())
                .collect(Collectors.toList());
    }
}
