import java.util.Map;

public class StreamMap {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 1, "B", 2, "C", 3);
        map.entrySet().stream()
            .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue())); 
    }
}
