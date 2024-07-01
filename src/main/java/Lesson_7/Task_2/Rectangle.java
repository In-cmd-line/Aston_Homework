package Lesson_7.Task_2;

public class Rectangle extends GeometryFigure implements CalcAreaAndPerim {
    // ИСПРАВЛЕНО: id изменено на type, просто изначально интерфейс должен был смотреть id фигуры,
    // а не количество сторон. В целом, не вижу противоречия - в id прописывать буквенное значение.
    public static String type;
    private static int sideA;
    private static int sideB;

    public static int getSideA() {
        return sideA;
    }

    public static int getSideB() {
        return sideB;
    }

    public static String getType() {
        return type;
    }

    // конструктор
    public Rectangle(String colorBorder, String colorInside, int sideA, int sideB) {
        super(colorBorder, colorInside);
        this.sideA = sideA;
        this.sideB = sideB;
        type = "Прямоугольник";
    }

    // реализация недефолтного метода в интерфейсе
    public double calcPerim() {
        return (sideA + sideB) * 2; // ИСПРАВЛЕНО: убрана лишняя переменная
    }
}
