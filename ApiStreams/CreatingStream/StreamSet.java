import java.util.Set;
import java.util.stream.Stream;

public class StreamSet {
    public static void main(String[] args) {
        Set<Integer> set = Set.of(1, 2, 3, 4);
        Stream<Integer> stream = set.stream();
        stream.forEach(System.out::println);
    }
}
