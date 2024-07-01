package Lesson_7.Task_1;

// создать класс животных, которые умеют бегать и плавать
// ИСПРАВЛЕНО: теперь класс абстрактный
public abstract class Animal {
    protected String name;
    private static int count = 0; // счётчик всех животных

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " м.");
    }
}