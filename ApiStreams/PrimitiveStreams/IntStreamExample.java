import java.util.stream.IntStream;

public class IntStreamExample {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1, 5); 
        intStream.forEach(System.out::println); 
    }
}
