package Lession_7.Task_2;

public class Сircle extends GeometryFigure implements CalcAreaAndPerim {
    String id = "Круг";
    // этот метод нужен для передачи инфы в интерфейс, чтобы дефолтный метод из интерфейса
    // был универсальным для всех фигур
    public int getSideA() {
        return this.sideA;
    }

    // следующие два метода здесь не используется, они нужен только для того,
    // что бы не объявлять класс абстрактным
    public int getSideB() {
        return this.sideB;
    }

    public int getSideC() {
        return this.sideC;
    }

    // конструктор
    public Сircle(String name, String colorBorder, String colorInside, int sideA) {
        super(name, colorBorder, colorInside);
        this.sideA = sideA;
    }

    // реализация недефолтного метода в интерфейсе
    public double calcPerim() {
        double result;
        result = 2 * Math.PI * sideA;
        return result;
    }
}
