import java.util.*;
import java.util.stream.Collectors;

public class GroupingStream {
    public static void main(String[] args) {
        List<String> items = List.of("apple", "banana", "cherry", "apricot", "blueberry");

        Map<Character, List<String>> groupedByFirstLetter = items.stream()
                                                                 .collect(Collectors.groupingBy(word -> word.charAt(0)));
        System.out.println("Grouped: " + groupedByFirstLetter);
    }
}
