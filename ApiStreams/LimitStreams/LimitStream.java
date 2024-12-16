import java.util.List;

public class LimitStream {
    public static void main(String[] args) {
        List<String> items = List.of("Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig", "Grape");

        items.stream()
             .limit(5) 
             .forEach(System.out::println); 
    }
}
