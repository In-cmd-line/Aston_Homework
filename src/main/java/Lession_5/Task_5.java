package Lession_5;
// сумма двух переменных от 10 до 20? - true/false
public class Task_5 {
    public static boolean checkSum (int num1, int num2) {
        boolean result = false;
        if (10 <= num1 + num2 && num1 + num2 <= 20) {
            result = true;
        }
        System.out.println(result); // этa строка для проверки, она не требовалась в задании
        return result;
    }
}
