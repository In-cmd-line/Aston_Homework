package Lession_5;
// положительное или отрицательное - true/false
public class Task_7 {
    public static boolean checkNumberPosNeg (int num) {
        boolean result = false;
        if (num < 0) {
            result = true;
        }
        System.out.println(result); // этa строка для проверки, она не требовалась в задании
        return result;
    }
}