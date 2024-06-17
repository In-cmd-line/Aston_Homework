package Lession_5;

import java.util.Arrays;
// инвертировать массив
public class Task_10 {
    public static void reverseArray () {
        byte[] arrBinar = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arrBinar.length; i++) {
            if (arrBinar[i] == 1) {
                arrBinar[i] = 0;
            }
            else {
                arrBinar[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arrBinar)); // этa строка для проверки, она не требовалась в задании
    }
}
