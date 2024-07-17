package Lession_7.Task_2;

public class Triangle extends GeometryFigure implements CalcAreaAndPerim {
    String id = "Треугольник";

    // следующие три метода нужены для передачи инфы в интерфейс, чтобы дефолтный метод из интерфейса
    // был универсальным для всех фигур
    public int getSideA() {
        return this.sideA;
    }

    public int getSideB() {
        return this.sideB;
    }

    public int getSideC() {
        return this.sideC;
    }

    public Triangle(String name, String colorBorder, String colorInside, int sideA, int sideB, int sideC) {
        super(name, colorBorder, colorInside);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // реализация недефолтного метода в интерфейсе
    public double calcPerim() {
        double result;
        result = sideA + sideB + sideC;
        return result;
    }
}
