package Lession_7.Task_2;

public class Rectangle extends GeometryFigure implements CalcAreaAndPerim {
    String id = "Прямоугольник";
    // следующие два метода нужены для передачи инфы в интерфейс, чтобы дефолтный метод из интерфейса
    // был универсальным для всех фигур
    public int getSideA() {
        return this.sideA;
    }

    public int getSideB() {
        return this.sideB;
    }
    // этот метод здесь не используется, он нужен только для того,
    // что бы не объявлять класс абстрактным
    public int getSideC() {
        return this.sideC;
    }
    // конструктор
    public Rectangle(String name, String colorBorder, String colorInside, int sideA, int sideB) {
        super(name, colorBorder, colorInside);
        this.sideA = sideA;
        this.sideB = sideB;
    }
    // реализация недефолтного метода в интерфейсе
    public double calcPerim() {
        double result;
        result = (sideA + sideB) * 2;
        return result;
    }
}
