package Lession_5;
// год високостный или нет
public class Task_9 {
    public static boolean whatYear (int year) {
        boolean result = false;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            result = true;
        }
        System.out.println(result); // этa строка для проверки, она не требовалась в задании
        return result;
    }
}
