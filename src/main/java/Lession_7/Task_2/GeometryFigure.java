package Lession_7.Task_2;

// полагаю, характеристики фигур правильно закинуть в супер класс, а не в интерфейс
public class GeometryFigure {
    String name;
    String colorBorder;
    String colorInside;
    // ниже инициализируемые переменные нужны для дефолтного метода
    int sideA; // для круга эта стороная является радиусом, такой нэйминг сделан для удобства
    int sideB;
    int sideC;

    public GeometryFigure(String name, String colorBorder, String colorInside) {
        this.name = name;
        this.colorBorder = colorBorder;
        this.colorInside = colorInside;
        // ниже значения по-умолчанию нужны для дефолтного метода
        sideA = 0;
        sideB = 0;
        sideC = 0;
    }
}