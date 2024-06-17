package Lession_5;

import java.util.Arrays;
// элементы массива <6 умножить на 2
public class Task_12 {
    public static void changeArr() {
        int[] arrNum = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] < 6) {
                arrNum[i] = arrNum[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arrNum)); // этa строка для проверки, она не требовалась в задании
    }
}
