import java.util.stream.DoubleStream;

public class DoubleStreamExample {
    public static void main(String[] args) {
        DoubleStream doubleStream = DoubleStream.of(1.5, 2.5, 3.5);
        doubleStream.forEach(System.out::println); 
    }
}
