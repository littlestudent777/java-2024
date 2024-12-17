import java.util.*;
import java.util.stream.Collectors;

public class ListSetMapStream {
    public static void main(String[] args) {
        List<String> items = List.of("apple", "banana", "cherry");

        List<String> list = items.stream().collect(Collectors.toList());
        System.out.println("List: " + list); 

        Set<String> set = items.stream().collect(Collectors.toSet());
        System.out.println("Set: " + set); 

        Map<String, Integer> map = items.stream()
                                        .collect(Collectors.toMap(item -> item, String::length));
        System.out.println("Map: " + map); 
    }
}
