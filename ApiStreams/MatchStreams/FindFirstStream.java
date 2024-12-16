import java.util.List;

public class FindFirstStream {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 3, 8, 2);

        int firstNumber = numbers.stream()
                                 .sorted()
                                 .findFirst()
                                 .orElseThrow(() -> new RuntimeException("List is empty"));
        System.out.println("First number: " + firstNumber); 
    }
}
