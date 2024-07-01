package Lesson_7.Task_2;

public class Circle extends GeometryFigure implements CalcAreaAndPerim {
    // ИСПРАВЛЕНО: id изменено на type, просто изначально интерфейс должен был смотреть id фигуры,
    // а не количество сторон. В целом, не вижу противоречия - в id прописывать буквенное значение.
    // ИСПРАВЛЕНО: поля запривачены
    public static String type;
    private static int sideA;

    public static int getSideA() {
        return sideA;
    }

    public static String getType() {
        return type;
    }

    // конструктор
    Circle(String colorBorder, String colorInside, int sideA) {
        super(colorBorder, colorInside);
        this.sideA = sideA;
        type = "Круг";
    }

    // реализация недефолтного метода в интерфейсе
    public double calcPerim() {
        return 2 * Math.PI * sideA; // ИСПРАВЛЕНО: убрана лишняя переменная
    }
}