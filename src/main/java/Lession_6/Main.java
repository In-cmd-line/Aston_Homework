package Lession_6;
// в задании нет требования проверки, в отличие от предыдущего ДЗ, но этот модуль всё проверяет

import static Lession_6.ArrayOfEmployees.createArr;

public class Main {
    public static void main(String[] args) {
        Employee unknownEmply = new Employee();
        unknownEmply.printData();
        System.out.println();
        createArr();
        Park.Attraction parkAddAttrn = new Park().new Attraction();
        System.out.println(parkAddAttrn.mainInfo);
        System.out.println(parkAddAttrn.timeOfWork);
        System.out.println(parkAddAttrn.price);
    }
}