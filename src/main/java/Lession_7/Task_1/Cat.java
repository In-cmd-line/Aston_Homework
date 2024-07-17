package Lession_7.Task_1;

// создать класс Котиков
// наследуем Имя, приобретаем НЕумение плавать
// и рандомим количество еды для наполнения пузы (если я правильно понял задание)
public class Cat extends Animal {
    public boolean satiety;
    public int needFood; // рандомим количество еды для насыщения мохнатого
    public static int countCat = 0; // счётчик Котофеев

    public Cat(String name) {
        super(name);
        this.satiety = false;
        this.needFood = (int) (Math.random() * ((20 - 15) + 1)) + 15;
        countCat++;
    }

    public static int printCountCat() {
        return countCat;
    }

    // учим бегать
    @Override
    public void run(int distance) {
        System.out.println(distance <= 200 ? "Котофеич " + name + " пробежал " + distance + " м." :
                "Котя не может бегать больше 200 м - у него же лапки!");
    }

    // учим плавать
    @Override
    public void swim(int distance) {
        System.out.println("Котя не умеет плавать. " +
                "(На самом деле, умеет просто не хочет.)");
    }

}