import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    // задание_1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    // задание_2
    public static void chekSumSing() {
        int a = -51;
        int b = 50;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    // задание_3
    public static void printColor() {
        int value = 123;
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (0<value && value <= 100) {
            System.out.println("Жёлтый");
        }
        else {
            System.out.println("Зелёный");
        }
    }
    // задание_4
    public static void compareNumbers() {
        int a = 10;
        int b = 20;
        if (a >= b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }
    // задание_5
    public static boolean checkSum (int num1, int num2) {
        boolean result = false;
        if (10 <= num1 + num2 && num1 + num2 <= 20) {
            result = true;
        }
        System.out.println(result); // этa строка для проверки, она не требовалась в задании
        return result;
    }
    // задание_6
    public static void checkNumber (int num) {
        if (num < 0) {
            System.out.println("Число отрицательное");
        }
        else {
            System.out.println("Число положительное");
        }
    }
    // задание_7 (что делать с 0?)
    public static boolean checkNumberPosNeg (int num) {
        boolean result = false;
        if (num < 0) {
            result = true;
        }
        System.out.println(result); // этa строка для проверки, она не требовалась в задании
        return result;
    }
    // задание_8 (нужны ли проверки входных данных?)
    public static void printStrings (String str, int a) {
        for (int i = 0; i<a; i++) {
            System.out.println(str);
        }
    }
    // задание_9 нужна ли проверка входных?
    public static boolean whatYear (int year) {
        boolean result = false;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            result = true;
        }
        System.out.println(result); // этa строка для проверки, она не требовалась в задании
        return result;
    }
    // задание_10
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
    // задание_11
    public static void addNumInArr() {
        int numsArr[];
        numsArr = new int[100];
        for (int i = 0; i < numsArr.length; i++) {
            numsArr[i] = i+1;
        }
        System.out.println(Arrays.toString(numsArr)); // этa строка для проверки, она не требовалась в задании
    }
    // задание_12
    public static void changeArr() {
        int[] arrNum = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] < 6) {
                arrNum[i] = arrNum[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arrNum)); // этa строка для проверки, она не требовалась в задании
    }
    // задание_13
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
    // задание_14
    public static int arrReturn(int len, int initialValue) {
        int arrReturn[];
        arrReturn = new int[len];
        for (int i = 0; i < arrReturn.length; i++) {
            arrReturn[i] = initialValue;
        }
        System.out.println(Arrays.toString(arrReturn)); // этa строка для проверки, она не требовалась в задании
        return arrReturn[0];
    }
    public static void main (String [] args) {
        printThreeWords();
        chekSumSing();
        printColor();
        compareNumbers();
        checkSum(5, 6);
        checkNumber(10);
        checkNumberPosNeg(5);
        printStrings("in_cmd_line", 3);
        whatYear(2024);
        reverseArray();
        addNumInArr();
        changeArr();
        crossArr();
        arrReturn(10, 3);
    }
}