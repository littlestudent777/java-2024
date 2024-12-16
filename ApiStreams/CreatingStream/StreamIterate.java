import java.util.stream.Stream;

public class StreamIterate {
    public static void main(String[] args) {
        Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 2);
        infiniteStream.limit(5).forEach(System.out::println); 
    }
}
