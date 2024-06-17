package Lession_5;

import java.util.Arrays;
// заполнить массив 1-100
public class Task_11 {
    public static void addNumInArr() {
        int numsArr[];
        numsArr = new int[100];
        for (int i = 0; i < numsArr.length; i++) {
            numsArr[i] = i+1;
        }
        System.out.println(Arrays.toString(numsArr)); // этa строка для проверки, она не требовалась в задании
    }
}
