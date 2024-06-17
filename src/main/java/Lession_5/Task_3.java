package Lession_5;
// вывод цвета в зависимости от переменной
public class Task_3 {
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
}
