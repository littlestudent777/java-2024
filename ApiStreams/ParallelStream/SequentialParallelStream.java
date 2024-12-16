import java.util.ArrayList;
import java.util.Collections;

public class SequentialParallelStream {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<String>();
        Collections.addAll(cities, "Париж", "Лондон", "Мадрид", "Берлин", "Рим", "Дублин", "Прага");

        System.out.println("Последовательный поток:");
        cities.stream()
            .filter(s -> {
                System.out.println("Обработка " + s + " в " + Thread.currentThread().getName());
                return s.length() == 6;
            }) 
            .forEach(s -> System.out.println("Результат: " + s));

        System.out.println("\nПараллельный поток:");
        cities.parallelStream() 
            .filter(s -> {
                System.out.println("Обработка " + s + " в " + Thread.currentThread().getName());
                return s.length() == 6;
            }) 
            .forEach(s -> System.out.println("Результат: " + s));
    }
}

