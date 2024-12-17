import java.util.List;
import java.util.stream.Stream;

public class StreamList {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Cherry");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
    }
}
