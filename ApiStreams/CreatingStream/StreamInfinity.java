import java.util.stream.Stream;

public class StreamInfinity {
    public static void main(String[] args) {
        Stream<String> infiniteStream = Stream.generate(() -> "Hello");
        infiniteStream.limit(3).forEach(System.out::println);
    }
}
