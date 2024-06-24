package Lession_7;

// создать класс Собакенов
public class Dog extends Animal {
    public static int countDog = 0; // счётчик Собакенов

    public Dog(String name) {
        super(name);
        countDog++;
    }

    public static int printCountDog() {
        return countDog;
    }

    // учим бегать
    @Override
    public void run(int distance) {
        System.out.println(distance <= 500 ? "Собакен " + name + " - хороший мальчик, " +
                "пробежал " + distance + " м." :
                "Собакен не может бегать более 500 м, он устанет!");
    }

    // учим плавать
    @Override
    public void swim(int distance) {
        System.out.println(distance <= 10 ? "Собакен " + name + " - ихтиандр, и он " +
                "проплыл " + distance + " м." :
                "Собакен не может плавать более, чем на 10 м, собакен тоже устаёт!");
    }
}
