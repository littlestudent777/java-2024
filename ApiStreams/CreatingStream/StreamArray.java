import java.util.stream.Stream;

public class StreamArray {
    public static void main(String[] args) {
        String[] array = {"One", "Two", "Three"};
        Stream<String> stream = Stream.of(array);
        stream.forEach(System.out::println);
    }
}
