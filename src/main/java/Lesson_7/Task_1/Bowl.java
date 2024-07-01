package Lesson_7.Task_1;

// для удобстава делаем отдельный класс Еда
public class Bowl {
    // ИСПРАВЛЕНО: лишнее поле удалено
    protected int food = 0;
    // ИСПРАВЛЕНО: теперь еда закидывается при создании объекта
    public Bowl(int food) {
        this.food = food;
    }

    // метод для добавки еды
    public void addFood(int add) {
        food += add;
    }
}
