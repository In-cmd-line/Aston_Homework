package Lession_7.Task_1;

// создать класс Котиков
// наследуем Имя, приобретаем НЕумение плавать
// и рандомим количество еды для наполнения пузы (если я правильно понял задание)
public class Cat extends Animal {
    private int maxRunDistance = 200; // ИСПРАВЛЕНО: ограничение передвижения вынесено в константу (если я верно понял)
    private boolean isSatiety; // ИСПРАВЛЕНО: запривачены поля
    private int needFood; // рандомим количество еды для насыщения мохнатого
    private static int countCat = 0; // счётчик Котофеев

    public Cat(String name) {
        super(name);
        this.isSatiety = false;
        this.needFood = (int) (Math.random() * ((20 - 15) + 1)) + 15;
        countCat++;
    }

    // ИСПРАВЛЕНО: добавлены методы для Приват полей
    public static int getCountCat() {
        return countCat;
    }

    public boolean getSatiety() {
        return isSatiety;
    }

    public void setSatiety(boolean var) {
        this.isSatiety = var;
    }

    public int getNeedFood() {
        return needFood;
    }


    // учим бегать
    @Override
    public void run(int distance) {
        System.out.println(distance <= maxRunDistance ? "Котофеич " + name + " пробежал " + distance + " м." :
                "Котя не может бегать больше 200 м - у него же лапки!");
    }

    // учим плавать
    @Override
    public void swim(int distance) {
        System.out.println("Котя не умеет плавать. " +
                "(На самом деле, умеет просто не хочет.)");
    }

}