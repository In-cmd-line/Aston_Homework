package Lession_5;

import java.util.Arrays;
// заполнить "1" диагонали массива
public class Task_13 {
    public static void crossArr() {
        int[][] table = new int[11][11];
        for (int i = 0; i < table[0].length; i++) {
            for (int j = 0; j < table[1].length; j++) {
                if (i == j || i + j == (table[0].length - 1)) {
                    table[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < table[0].length; i++) { // этa строка для проверки, она не требовалась в задании
            System.out.println(Arrays.toString(table[i])); // этa строка для проверки, она не требовалась в задании
        }
    }
}
