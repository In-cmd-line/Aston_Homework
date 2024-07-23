package Lesson_9;

import java.util.HashMap;

public class PhoneBook {

    // вообще, думаю, что в качестве ключа можно было бы использовать массив или другую коллекцию
    // на тот случай, если у юзера много номеров, но в задании указано: "создать простой класс"
    private static HashMap<String, String> varPhoneBook;

    // конструктор
    public PhoneBook() {
        this.varPhoneBook = new HashMap<>();
    }

    // метод add для добавления записи
    public static void addEntry(String number, String lastName) {
        varPhoneBook.put(number, lastName);
    }

    // метод get для получения номера телефона по фамилии
    public static void getEntry(String lastName) {
        for (HashMap.Entry<String, String> entry : varPhoneBook.entrySet()) {
            if (entry.getValue() == lastName) {
                System.out.println(lastName + " " + entry.getKey());
            }
        }
    }
}
