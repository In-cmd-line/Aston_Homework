package Lession_5;

import java.util.Arrays;
// сздать массив длины Х с элементами У
public class Task_14 {
    public static int arrReturn(int len, int initialValue) {
        int arrReturn[];
        arrReturn = new int[len];
        for (int i = 0; i < arrReturn.length; i++) {
            arrReturn[i] = initialValue;
        }
        System.out.println(Arrays.toString(arrReturn)); // этa строка для проверки, она не требовалась в задании
        return arrReturn[0];
    }
}
