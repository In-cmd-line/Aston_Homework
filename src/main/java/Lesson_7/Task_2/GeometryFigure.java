package Lesson_7.Task_2;

// полагаю, характеристики фигур правильно закинуть в супер класс, а не в интерфейс
public abstract class GeometryFigure { // ИСПРАВЛЕНО: класс теперь абстрактный
    // ИСПРАВЛЕНО: общих полей сделано 2 (лишнее поле убрано)
    String colorBorder;
    String colorInside;

    // ИСПРАВЛЕНО: убраны все лишние поля, которые были нужны для универсализации метода
    // итерфейс теперь работает по-другому
    public GeometryFigure(String colorBorder, String colorInside) {
        this.colorBorder = colorBorder;
        this.colorInside = colorInside;
    }
}