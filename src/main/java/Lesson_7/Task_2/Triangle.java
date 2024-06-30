package Lesson_7.Task_2;

public class Triangle extends GeometryFigure implements CalcAreaAndPerim {
    // ИСПРАВЛЕНО: id изменено на type, просто изначально интерфейс должен был смотреть id фигуры,
    // а не количество сторон. В целом, не вижу противоречия - в id прописывать буквенное значение.
    public static String type;
    private static int sideA;
    private static int sideB;
    private static int sideC;

    public static int getSideA() {
        return sideA;
    }

    public static int getSideB() {
        return sideB;
    }

    public static int getSideC() {
        return sideC;
    }

    public static String getType() {
        return type;
    }

    // конструктор
    public Triangle(String colorBorder, String colorInside, int sideA, int sideB, int sideC) {
        super(colorBorder, colorInside);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        type = "Треугольник";
    }

    // реализация недефолтного метода в интерфейсе
    public double calcPerim() {
        return sideA + sideB + sideC; // ИСПРАВЛЕНО: убрана лишняя переменная
    }
}