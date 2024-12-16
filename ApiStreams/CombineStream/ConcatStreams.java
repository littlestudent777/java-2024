import java.util.List;
import java.util.stream.Stream;

public class ConcatStreams {
    public static void main(String[] args) {
        List<String> namesFromApi = List.of("John", "Jane", "Alice");
        List<String> namesFromCsv = List.of("Bob", "Charlie");

        Stream<String> combinedNames = Stream.concat(namesFromApi.stream(), namesFromCsv.stream());

        combinedNames.map(name -> "Name: " + name)
                     .forEach(System.out::println);
    }
}
