import java.util.List;

public class SkipStream {
    public static void main(String[] args) {
        List<String> items = List.of("Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig", "Grape");

        items.stream()
             .skip(3)
             .forEach(System.out::println); 
    }
}
