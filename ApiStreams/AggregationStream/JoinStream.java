import java.util.List;
import java.util.stream.Collectors;

public class JoinStream {
    public static void main(String[] args) {
        List<String> words = List.of("Java", "is", "awesome");

        String result = words.stream()
                             .collect(Collectors.joining(" "));
        System.out.println("Joined String: " + result); 
    }
}
