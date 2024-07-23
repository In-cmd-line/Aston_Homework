package Lession_7.Task_2;

public interface CalcAreaAndPerim {
    int getSideA();
    int getSideB();
    int getSideC();

    // реализация дефолтного метода в интерфейсе
    // метод получился универсальным для всех фигур без необходимости переопределения =)
    default double calcArea() {
        double result;
        if (this.getSideC() > 0) {
            double p = (getSideA() + getSideB() + getSideC()) / 2;
            result = Math.sqrt(p * (p - getSideA()) * (p - getSideB()) * (p - getSideC()));
        } else if (this.getSideB() > 0) {
            result = getSideA() * getSideA();
        } else {
            result = Math.PI * getSideA() * getSideA();
        }
        return result;
    }

    // реализация недефолтного метода в интерфейсе
    double calcPerim();
}
