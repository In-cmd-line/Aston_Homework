package Lession_7.Task_1;

// проверяем ВСЁ
public class Main {
    public static void main(String[] args) {
        Food dishOfFood = new Food(); // начальное количество еды задано в классе
        dishOfFood.addFood(30); // тут можно добавить вкусняшек

        // тестим Котофеича в спорт режиме
        Cat catBarsik = new Cat("Барсик");
        catBarsik.run(150);
        catBarsik.run(250);
        catBarsik.swim(100);
        System.out.println();

        // тестим Собакена в спорт режиме
        Dog dogBobik = new Dog("Бобик");
        dogBobik.run(450);
        dogBobik.run(520);
        dogBobik.swim(5);
        dogBobik.swim(12);
        System.out.println();

        // масив Котофеичей
        Cat[] bunchOfCats = new Cat[5];
        bunchOfCats[0] = new Cat("Мурзик");
        bunchOfCats[1] = new Cat("Марсик");
        bunchOfCats[2] = new Cat("Пузик");
        bunchOfCats[3] = new Cat("Батон");
        bunchOfCats[4] = new Cat("Повелитель Вселенной, Лорд Пушистик, " +
                "Создатель всея Сущего, Мистер Мохнатые Лапки и просто отличный Котик");
        // кормим Мохнатых
        for (Cat i : bunchOfCats) {
            if (dishOfFood.food >= i.needFood) {
                dishOfFood.food -= i.needFood;
                i.satiety = true;
            }
            System.out.println(i.satiety ? "Котофей " + i.name +
                    " сыт, доволен и не будет уничтожать человечество!" :
                    "Котя " + i.name + " голодный и грустный!");
            System.out.println("Мохнатому надо было " +
                    i.needFood + " еды."); // вывод на печать для проверки, сколько еды требовалось
            System.out.println("В миске осталось " +
                    dishOfFood.food + " еды.");
            System.out.println();
        }
        System.out.println("Всего создано животных - " + Animal.printCount());
        System.out.println("Из них Котофеев - " + Cat.printCountCat());
        System.out.println("И Собакенов - " + Dog.printCountDog());
    }
}
