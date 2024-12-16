import java.util.List;

public class AnyMatchStream {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 7, 8, 12, 5);

        boolean hasNumberGreaterThan10 = numbers.stream()
                                                .anyMatch(n -> n > 10);
        System.out.println("Contains number > 10: " + hasNumberGreaterThan10); 
    }
}
