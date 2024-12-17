import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();//Создание
        map.put("Apple", 1); // Добавление элементов
        map.put("Banana", 2);
        map.put("Orange", 3);
        System.out.println("После добавления элементов: " + map);
        // Получаем значение по ключу
        int appleValue = map.get("Apple");
        System.out.println("Значение для ключа 'Apple': " + appleValue);
        // Проверяем наличие ключа
        boolean hasBanana = map.containsKey("Banana");
        System.out.println("Содержит ли ключ 'Banana': " + hasBanana);
        // Проверяем наличие значения
        boolean hasValue3 = map.containsValue(3);
        System.out.println("Содержит ли значение 3: " + hasValue3);
        map.put("Apple", 5); // Обновляем значение
        System.out.println("После обновления значения для 'Apple': " + map);
        map.remove("Banana"); // Удаляем элемент по ключу
        System.out.println("После удаления ключа 'Banana': " + map);
        int size = map.size(); // Получаем размер HashMap
        System.out.println("Размер HashMap: " + size);
        // Перебираем все элементы
        System.out.println("Перебор всех элементов:");
        for (String key : map.keySet()) {
            System.out.println("Ключ: " + key + ", Значение: " + map.get(key));
        } }
}
