import java.util.List;
import java.util.stream.Collectors;

public class SumAverageStream {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                         .collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Sum: " + sum); 

        double average = numbers.stream()
                                .collect(Collectors.averagingInt(Integer::intValue));
        System.out.println("Average: " + average); 
    }
}
