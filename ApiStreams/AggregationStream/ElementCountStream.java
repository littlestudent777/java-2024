import java.util.List;
import java.util.stream.Collectors;

public class ElementCountStream {
    public static void main(String[] args) {
        List<String> items = List.of("apple", "banana", "cherry");
        long count = items.stream()
                          .collect(Collectors.counting());
        System.out.println("Count: " + count); 
    }
}
