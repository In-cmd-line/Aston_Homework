package Lesson_7.Task_2;

// создаём фигуры и выводим на печать
// по-хорошему, одинаковые принты тоже бы в метод закинуть иль печать из массива производить,
// что бы повторяющегося кода избежать, но в задании такого не было, поэтому не трогаю =)
public class Main {
    public static void main(String[] args) {
        Circle figure1 = new Circle("Синий", "Зелёный", 10);
        System.out.println("Фигура " + figure1.type + ":");
        System.out.println("Периметр - " + figure1.calcPerim() + " ед");
        System.out.println("Площадь - " + figure1.calcArea() + " ед2");
        System.out.println("Цвет заливки - " + figure1.colorInside);
        System.out.println("Цвет границы - " + figure1.colorBorder);
        System.out.println();

        Rectangle figure2 = new Rectangle("Красная", "Жёлтая", 3, 4);
        System.out.println("Фигура " + figure2.type + ":");
        System.out.println("Периметр - " + figure2.calcPerim() + " ед");
        System.out.println("Площадь - " + figure2.calcArea() + " ед2");
        System.out.println("Цвет заливки - " + figure2.colorInside);
        System.out.println("Цвет границы - " + figure2.colorBorder);
        System.out.println();

        Triangle figure3 = new Triangle("Голубая", "Оранжевая", 3, 4, 5);
        System.out.println("Фигура " + figure3.type + ":");
        System.out.println("Периметр - " + figure3.calcPerim() + " ед");
        System.out.println("Площадь - " + figure3.calcArea() + " ед2");
        System.out.println("Цвет заливки - " + figure3.colorInside);
        System.out.println("Цвет границы - " + figure3.colorBorder);
        System.out.println();
    }
}