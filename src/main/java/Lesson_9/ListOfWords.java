package Lesson_9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ListOfWords {
    public static void main(String[] args) {
        // массив элементов (с повторениями)
        String[] arrOfWords = {"печенька", "пельмешка", "греча", "чебурек", "шавуха", "сухарик",
                "оладушка", "чипсики", "греча", "котлетка", "макарошки", "хрустик", "шоколадка",
                "шавуха", "плюшки", "оладушка", "пюрешка", "чебупели", "пицца"};

        // создаём коллекцию с уникальными элементами на основе массива
        // повторяющиеся элементы сами отваливаются
        Set<String> setCollectionBasedArray = new HashSet<>();
        for (String element : arrOfWords) {
            setCollectionBasedArray.add(element);
        }

        // при необходимости можно при выводе пробежать циклом, но не вижу смысла
        System.out.println("\nСписок уникальных слов заданного массива:\n"  + setCollectionBasedArray);

        // создаём коллекцию с уникальными ключами на основе массива
        // повторяющиеся элементы в процессе заполнения отваливаются и самоподсчитываются,
        // а getOrDefault позволяет без ошибок реагировать если у ключа пока нет значения
        HashMap<String, Integer> mapCollectionBasedArray = new HashMap<>();
        for (String element : arrOfWords) {
            mapCollectionBasedArray.put(element, mapCollectionBasedArray.getOrDefault(element, 0) + 1);
        }

        // при необходимости можно при выводе пробежать циклом, но не вижу смысла
        System.out.println("\nКоличество повторений слов из заданного массива:\n"  + mapCollectionBasedArray);
    }
}
