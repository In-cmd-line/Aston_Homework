package Lession_6;
// Запускаем - проверяем

import static Lession_6.ArrayOfEmployees.createArr;

public class Main {
    public static void main(String[] args) {
        Employee unknownEmply = new Employee();
        unknownEmply.printData();
        System.out.println();
        createArr();
        Park.Attraction parkAddAttrn = new Park().new Attraction(
                "Адовая крутилка", "с 12.00 до 17.00", 300);
        System.out.println(parkAddAttrn.mainInfo);
        System.out.println(parkAddAttrn.timeOfWork);
        System.out.println(parkAddAttrn.price + "р");
    }
}