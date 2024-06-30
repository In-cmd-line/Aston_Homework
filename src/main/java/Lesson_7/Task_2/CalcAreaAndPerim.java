package Lesson_7.Task_2;

public interface CalcAreaAndPerim {

    // реализация дефолтного метода в интерфейсе
    // метод получился универсальным для всех фигур без необходимости переопределения =)

    // ИСПРАВЛЕНО: в комментарии было указано, что определение по количеству сторон - не есть хорошо,
    // теперь фигуру определяем по type
    default double calcArea() {
        double result;
        if (Triangle.getType() == "Треугольник") {
            double p = (Triangle.getSideA() + Triangle.getSideB() + Triangle.getSideC()) / 2;
            result = Math.sqrt(p * (p - Triangle.getSideA()) * (p - Triangle.getSideB()) * (p - Triangle.getSideC()));
        } else if (Rectangle.getType() == "Прямоугольник") {
            result = Rectangle.getSideA() * Rectangle.getSideB();
        } else if (Circle.getType() == "Круг") {
            result = Math.PI * Circle.getSideA() * Circle.getSideA();
        } else {
            System.out.println("Недопустимая фигура");
            result = 0;
        }
        return result;
    }

    // реализация недефолтного метода в интерфейсе
    double calcPerim();
}