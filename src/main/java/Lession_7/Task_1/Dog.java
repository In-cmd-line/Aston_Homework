package Lession_7.Task_1;

// создать класс Собакенов
public class Dog extends Animal {
    private int maxRunDistance = 500; // ИСПРАВЛЕНО: ограничение передвижения вынесено в константу (если я верно понял)
    private int maxSwimDistance = 10; // ИСПРАВЛЕНО: ограничение передвижения вынесено в константу (если я верно понял)
    private static int countDog = 0; // счётчик Собакенов

    public Dog(String name) {
        super(name);
        countDog++;
    }

    public static int getCountDog() {
        return countDog;
    }

    // учим бегать
    @Override
    public void run(int distance) {
        System.out.println(distance <= maxRunDistance ? "Собакен " + name + " - хороший мальчик, " +
                "пробежал " + distance + " м." :
                "Собакен не может бегать более 500 м, он устанет!");
    }

    // учим плавать
    @Override
    public void swim(int distance) {
        System.out.println(distance <= maxSwimDistance ? "Собакен " + name + " - ихтиандр, и он " +
                "проплыл " + distance + " м." :
                "Собакен не может плавать более, чем на 10 м, собакен тоже устаёт!");
    }
}
