package Lesson_9;

public class Main {
    public static void main(String[] args) {

        // создаём книгу, делаем новые записи
        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.addEntry("8-911-462-75-25", "Гагарин");
        myPhoneBook.addEntry("8-911-753-12-36", "Терешкова");
        myPhoneBook.addEntry("8-911-159-45-69", "Титов");
        myPhoneBook.addEntry("8-911-789-78-58", "Падалка");
        myPhoneBook.addEntry("8-911-456-96-47", "Гагарин");
        myPhoneBook.addEntry("8-911-123-63-14", "Гагарин");
        myPhoneBook.addEntry("8-911-896-46-28", "Леонов");

        // ищем телефоны по фамилии
        myPhoneBook.getEntry("Гагарин");
        myPhoneBook.getEntry("Титов");

    }
}
