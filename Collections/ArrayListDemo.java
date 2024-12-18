import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(); // Создание
        fruits.add("Apple"); // Добавление элементов
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("После добавления: " + fruits);
        // Получение элемента по индексу
        String firstFruit = fruits.get(0);
        System.out.println("Первый фрукт: " + firstFruit);
        fruits.set(1, "Orange"); // Изменение элемента
        System.out.println("После изменения второго фрукта: " + fruits);
        fruits.remove(2); // Удаляем "Cherry"
        System.out.println("После удаления третьего фрукта: " + fruits);
        int size = fruits.size(); // Размер списка
        System.out.println("Размер списка: " + size);
        // Проверка наличия элемента
        boolean hasApple = fruits.contains("Apple");
        System.out.println("Список содержит 'Apple': " + hasApple);
        // Очистка списка
        fruits.clear();
        System.out.println("После очистки списка: " + fruits);
    }
}
