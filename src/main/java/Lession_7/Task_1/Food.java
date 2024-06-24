package Lession_7.Task_1;

// для удобстава делаем отдельный класс Еда
public class Food {
    int food;
    int add;

    // по-умолчанию закидываем в миску немного еды
    public Food() {
        this.food = 30;
    }

    // метод для добавки еды
    public void addFood(int add) {
        food += add;
    }
}
